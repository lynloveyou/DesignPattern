package com.lyn.demo.businessDelegate.impl;

import com.lyn.demo.businessDelegate.BusinessService;

public class NullService implements BusinessService{
    @Override
    public void doProcessing(){
        System.out.println("do nothing service....");
    }
}
