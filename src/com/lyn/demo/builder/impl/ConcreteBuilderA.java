package com.lyn.demo.builder.impl;

import com.lyn.demo.builder.Builder;
import com.lyn.demo.builder.Product;

public class ConcreteBuilderA implements Builder{
    private Product product;
    
    public ConcreteBuilderA()
    {
        product = new Product();
    }
    
    @Override
    public void buildMainFood(){
        this.product.setMainFood("mainFoodA");
    }

    @Override
    public void buildSubsidiaryFood(){
        this.product.setSubsidiaryFood("subsidiaryFoodA");
    }

    @Override
    public void buildDrink(){
        this.product.setDrink("drinkA");
    }

    @Override
    public Product getProudct(){
        return product;
    }
    
    
}
