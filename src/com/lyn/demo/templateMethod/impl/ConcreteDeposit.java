package com.lyn.demo.templateMethod.impl;

import com.lyn.demo.templateMethod.AbstractBank;

public class ConcreteDeposit extends AbstractBank{
    @Override
    public void transact(){
        System.out.println("---deposit---");
    }
}
