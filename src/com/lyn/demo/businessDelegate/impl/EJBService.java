package com.lyn.demo.businessDelegate.impl;

import com.lyn.demo.businessDelegate.BusinessService;

public class EJBService implements BusinessService{
    @Override
    public void doProcessing(){
        System.out.println("do EJB service.....");
    }
}
