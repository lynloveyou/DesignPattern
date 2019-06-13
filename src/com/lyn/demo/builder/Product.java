package com.lyn.demo.builder;

/**
 * 具体产品类 
 */
public class Product{
    private String mainFood;
    private String subsidiaryFood;
    private String drink;
    
    public String getMainFood(){
        return mainFood;
    }
    public void setMainFood(String mainFood){
        this.mainFood = mainFood;
    }
    public String getSubsidiaryFood(){
        return subsidiaryFood;
    }
    public void setSubsidiaryFood(String subsidiaryFood){
        this.subsidiaryFood = subsidiaryFood;
    }
    public String getDrink(){
        return drink;
    }
    public void setDrink(String drink){
        this.drink = drink;
    } 
    
    public void showToClient()
    {
        System.out.println("mainfood:"+getMainFood());
        System.out.println("subsidiaryFood:"+getSubsidiaryFood());
        System.out.println("drink:"+getDrink());
    }
    
}
