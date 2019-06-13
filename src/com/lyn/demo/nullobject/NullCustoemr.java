package com.lyn.demo.nullobject;

/**
 *空实现对象
 */
public class NullCustoemr extends AbstractCustomer{
    @Override
    public boolean isNil(){
        return true;
    }

    @Override
    public String getName(){
        return "Not Available in Customer Database";
    }
}
