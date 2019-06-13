package com.jvm.method;

public class Merchant3<T extends Customer>{
    public Number actionPrice(double orgince,T customer)
    {
        return orgince*0.8d;
    }
}
