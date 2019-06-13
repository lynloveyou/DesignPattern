package com.lyn.demo.nullobject;

public class Client{
    public static void main(String[] args){
        /**
         * 抽象类  空对象和实现兑现都要继承的基类
         * 空实现类     空实现抽象类的类
         * 实现类  实际实现抽象类的类
         */
        AbstractCustomer customera = CustomerFactory.getCustomer("john");
        AbstractCustomer customerb = CustomerFactory.getCustomer("lily");
        AbstractCustomer customerc = CustomerFactory.getCustomer("siri");
        AbstractCustomer customerd = CustomerFactory.getCustomer("lyn");
        AbstractCustomer customere = CustomerFactory.getCustomer("cristina");
        AbstractCustomer customerf = CustomerFactory.getCustomer("solr");
        System.out.println("customers");
        System.out.println(customera.getName());
        System.out.println(customerb.getName());
        System.out.println(customerc.getName());
        System.out.println(customerd.getName());
        System.out.println(customere.getName());
        System.out.println(customerf.getName());
    }
}
