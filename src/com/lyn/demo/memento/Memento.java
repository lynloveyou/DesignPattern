package com.lyn.demo.memento;

public class Memento{
    
    //用于保存状态
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }
    
}
