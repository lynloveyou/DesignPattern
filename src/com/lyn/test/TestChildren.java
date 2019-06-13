package com.lyn.test;

public class TestChildren extends TestParent{
    public TestChildren(){
    }

    @Override
    public void initName(){
        System.out.println("-----------");
    }
    
    public static void main(String[] args){
        new TestChildren();
    }
}
