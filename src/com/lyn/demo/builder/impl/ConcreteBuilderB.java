package com.lyn.demo.builder.impl;

import com.lyn.demo.builder.Builder;
import com.lyn.demo.builder.Product;

public class ConcreteBuilderB implements Builder{
    private Product product;
    
    public ConcreteBuilderB()
    {
        product = new Product();
    }

    @Override
    public void buildMainFood(){
        product.setMainFood("mainFoodB");
    }

    @Override
    public void buildSubsidiaryFood(){
        this.product.setSubsidiaryFood("subsidiaryFoodB");
    }

    @Override
    public void buildDrink(){
        this.product.setDrink("drinkB");
    }

    @Override
    public Product getProudct(){
        return product;
    }
}
