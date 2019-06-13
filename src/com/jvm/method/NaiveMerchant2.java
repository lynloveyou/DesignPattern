package com.jvm.method;

public class NaiveMerchant2 extends Merchant2{
    
    @Override
    public Double actionPrice(double orgince,Customer customer)
    {
        return 0d;
    }
    
    public static Number actionPrice3(double orgince,Customer customer)
    {
        return NaiveMerchant2.actionPrice2(orgince, customer);
    }
}
