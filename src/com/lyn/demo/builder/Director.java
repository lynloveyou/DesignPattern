package com.lyn.demo.builder;

public class Director{
    private Builder builder;
    public Director(){
    }
    
    public void buildFood(Builder builder)
    {
        builder.buildMainFood();
        builder.buildSubsidiaryFood();
        builder.buildDrink();
        this.builder = builder;
    }
    
    public Product getProduct()
    {
        return this.builder.getProudct();
    }
}
