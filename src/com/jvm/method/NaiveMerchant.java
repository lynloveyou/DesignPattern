package com.jvm.method;

import java.util.Random;

public class NaiveMerchant extends Merchant{
    
    @Override
    public double actionPrice(double orgince,Customer customer)
    {
        if(customer.isVIP())
        {
           return orgince*priceDiff();
        }else
        {
           return super.actionPrice(orgince, customer);
        }
    }
    
    public static double priceDiff()
    {
        return new Random().nextDouble()+0.8d;
    }
}
