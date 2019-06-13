package com.jvm.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionCatch{
    public static void main(String[] args) throws FileNotFoundException, IOException{
    String s = null;
    assert s!=null?true:false:"错误信息";
    assert false;
    System.out.println("end");
        try{
            throwException();
            System.out.println("123");
            throwException();
        }catch (Exception e){
            e.printStackTrace();
        }finally
        {
            System.out.println("------------");
        }
        try(FileInputStream inputStream = new FileInputStream(new File("test"))){
            throw new RuntimeException("init exception");
        }
        
    }
    
    public static void throwException(){        
        try{
    
            FileInputStream inputStream = new FileInputStream(new File("test"));
        }catch (IOException e){
            e.printStackTrace();
        }finally
        {
            System.out.println("------------");
        }
    }
}
