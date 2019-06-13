package com.lyn.demo.templateMethod.impl;

import com.lyn.demo.templateMethod.AbstractBank;

public class ConcreteTrancfer extends AbstractBank{
    @Override
    public void transact(){
        System.out.println("---trancfer---");
    }
}
