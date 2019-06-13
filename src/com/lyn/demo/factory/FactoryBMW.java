package com.lyn.demo.factory;

/**
 * 抽象工程 
 */
public interface FactoryBMW{
    
    //创建BMW车
    public BMW createBMW(String type);
    
    //创建对应配置的空调
    public Aircondition createAirC(String type);
    
}
