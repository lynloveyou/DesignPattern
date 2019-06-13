package com.lyn.demo.factory.impl;

import com.lyn.demo.factory.Aircondition;
import com.lyn.demo.factory.BMW;
import com.lyn.demo.factory.FactoryBMW;

//创建320系列的车和空调
public class FactoryBMW320 implements FactoryBMW{

    @Override
    public BMW createBMW(String type){
        return new BMW320();
    }

    @Override
    public Aircondition createAirC(String type){
        return new Aircondition320();
    }
}
