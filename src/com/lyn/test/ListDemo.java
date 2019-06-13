package com.lyn.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo{
    
    
    public static void main(String[] args)
    {
        List<String> list =new ArrayList<String>();
        list.add("123");
        list.add("456");
        list.add("789");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
        {
            String next = iterator.next();
            if(next.equals("456"))
            {
                iterator.remove();
            }
        }
        System.out.println("success"+list.toString());
        System.out.println("123".substring(0, "123".length()));
    }
}
