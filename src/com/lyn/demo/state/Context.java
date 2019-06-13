package com.lyn.demo.state;

import com.lyn.demo.state.impl.CloseState;
import com.lyn.demo.state.impl.OpenState;
import com.lyn.demo.state.impl.RunState;
import com.lyn.demo.state.impl.StopState;

public class Context{
    public static LiftState openState;
    public static LiftState closeState;
    public static LiftState runState;
    public static LiftState stopState;
    //初始化所有的状态值
    static
    {
        openState = new OpenState();
        closeState = new CloseState();
        runState = new RunState();
        stopState = new StopState();
    }
    
   //保存一个状态对象用于操作
   private  LiftState liftState;

   public LiftState getLiftState(){
        return liftState;
   }
    
   public void setLiftState(LiftState liftState){
        this.liftState = liftState;
        this.liftState.setContext(this);
   }
   
   
   //电梯门打开
   public void open()
   {
      this.liftState.open(); 
   }
   
   //电梯门关闭
   public void close()
   {
       this.liftState.close();
   }
   
   //电梯上线运行中
   public void run()
   {
       this.liftState.run();
   }
   
   //电梯停止
   public void stop()
   {
      this.liftState.stop(); 
   }
}
