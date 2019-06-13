package com.lyn.demo.memento;

public class Client{
    /**
     * 备忘录模式(Memento Pattern)
     *  Memento 原始状态角色 包含了要被恢复的对象的状态
     *  Originator 原始状态提供者  创建并在 Memento 对象中存储状态
     *  CareTaker 对象负责从 Memento 中恢复对象的状态。
     * @param args
     */
    public static void main(String[] args){
        Originator originator = new Originator();
        originator.setState("1");
        CareTaker careTaker = new CareTaker();
        careTaker.saveState(originator.toString(), originator.saveStateToMemento());
        originator.setState("2");
        originator.setState("3");
        System.out.println("originator state:"+originator.getState());
        originator.getStateByMemento(careTaker.getMemento(originator.toString()));
        System.out.println("originator state get by mementor:"+originator.getState());
    }
}
