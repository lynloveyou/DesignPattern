package com.lyn.demo.builder;

public class Director2{
    private Builder builder;
    
    public void buildFood(Builder builder)
    {
        builder.buildMainFood();
        builder.buildSubsidiaryFood();
        //不卖饮料
        //builder.buildDrink();
        this.builder = builder;
    }
    
    public Product getProduct()
    {
        return this.builder.getProudct();
    }
}
