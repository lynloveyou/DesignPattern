package com.lyn.demo.singleton;

public class InnerClassSingleton{
    private InnerClassSingleton(){};
    
    static class InnerClassHandler
    {
        public static final  InnerClassSingleton instance= new  InnerClassSingleton();
    }
    
    public static InnerClassSingleton getInstance()
    {
        return InnerClassHandler.instance;
    }
}
