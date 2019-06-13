package com.lyn.demo.businessDelegate;

public class Client{
    private BusinessDelegate delegate;
    public Client(BusinessDelegate delegate){
        this.delegate = delegate;
    }
    
    public void doTask()
    {
        delegate.doTask();
    }
   
    public void doTask(String serviceType)
    {
        delegate.setServiceType(serviceType);
        delegate.doTask();
    }
    
}
