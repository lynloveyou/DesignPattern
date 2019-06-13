package com.lyn.demo.businessDelegate;

public class BusinessDelegatePatternDemo{
    
    public static void main(String[] args){
        BusinessDelegate delegate = new BusinessDelegate("EJB");
        Client client = new Client(delegate);
        client.doTask();
        delegate.setServiceType("JMS");
        client.doTask();
        delegate.setServiceType("NIL");
        client.doTask();
        System.out.println("===================");
        client.doTask("JMS");
        client.doTask("NIL");
        client.doTask("EJB");
    }
}
