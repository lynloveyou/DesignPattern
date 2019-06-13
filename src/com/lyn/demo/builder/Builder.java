package com.lyn.demo.builder;

/**
 * 定义构造者 
 */
public interface Builder{
    
    //定义主食
    public void buildMainFood();
    
    //定义副食
    public void buildSubsidiaryFood();
    
    //定义饮料
    public void buildDrink();
    
    //得到构造好的产品
    public Product getProudct();
}
