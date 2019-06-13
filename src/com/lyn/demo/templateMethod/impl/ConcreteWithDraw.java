package com.lyn.demo.templateMethod.impl;

import com.lyn.demo.templateMethod.AbstractBank;

public class ConcreteWithDraw extends AbstractBank{
    @Override
    public void transact(){
        System.out.println("------withDraw----");
    }
}
