package com.lyn.demo.memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker{
    //原始状态存储
    public Map<String,Memento> stateMap = new HashMap<String,Memento>();
    
    //存储元数据状态
    public void saveState(String key,Memento memento)
    {
        this.stateMap.put(key, memento);
    }
   
    //放回元数据状态
    public Memento getMemento(String key)
    {
       return this.stateMap.get(key);
    }
}
