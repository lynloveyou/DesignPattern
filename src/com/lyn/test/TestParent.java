package com.lyn.test;

public abstract class TestParent{
    public TestParent(){
        initName();
    }
    
    public abstract void initName();
    
    public static void main(String[] args){
        System.out.println("---main-----");
    }
}
