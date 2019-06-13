package com.lyn.demo.command;

/**
 * 真正执行命令的接收者对象
 * 
 */
public class ReceiverTV{
    
    /**
     * 打开电视
     */
    public void actionOpen()
    {
        System.out.println("----------open TV--------");
    }
    
    /**
     * 关闭电视
     */
    public void actionClose()
    {
        System.out.println("----------close TV--------");
    }
    
    /**
     * 换频道
     */
    public void actionChange()
    {
        System.out.println("----------change channel--------");
    }
}
