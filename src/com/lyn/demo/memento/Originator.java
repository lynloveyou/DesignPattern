package com.lyn.demo.memento;

public class Originator{
    //设置状态
    private String state;

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }
    
   public Memento saveStateToMemento()
   {
       return new Memento(this.state);
   }
   
   public void getStateByMemento(Memento memento)
   {
       this.state = memento.getState();
   }
}
