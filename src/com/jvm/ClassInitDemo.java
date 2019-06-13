package com.jvm;

import com.lyn.algorithms.HalfSortAlgorithms;

public class ClassInitDemo{
    
    private ClassInitDemo(){
        System.out.println("------init---ClassInitDemo");
    }
    
    private static class ClassInitDemoInnerClass
    {
        static final ClassInitDemo demo = new ClassInitDemo();
        static final HalfSortAlgorithms demo2=new HalfSortAlgorithms();
        static final int k;
        static
        {
            System.out.println("--ClassInitDemoInnerClass---<clinit>--method--call");
            k = 123;
        }
    }
    
    public static Object getInstance(boolean flag)
    {
        if(flag)
        {
            return new ClassInitDemoInnerClass[1];
        }
        return ClassInitDemoInnerClass.demo;
    }
    
    public static void main(String[] args){
        getInstance(true);
        System.out.println("------------------分割线----------------");
        getInstance(false);
        getInstance(false);
        
    }
}
