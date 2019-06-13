package com.lyn.demo.state;

public interface LiftState{
    
    //设置控制的上下文
    public void setContext(Context context);
    
    //电梯门打开
    public void open();
    
    //电梯门关闭
    public void close();
    
    //电梯上线运行中
    public void run();
    
    //电梯停止
    public void stop();
}
