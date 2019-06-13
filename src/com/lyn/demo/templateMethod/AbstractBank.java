package com.lyn.demo.templateMethod;

/**
 * 银行业务 取号->交易->评价 
 */
public abstract class AbstractBank{
    //排队号码
    public static int number;
    
    /**
     *模板方法
     * 因为子类不能覆写一个被定义为final的方法。从而保证了子类的逻辑永远由父类所控制。
     *
     */
    public final void templateMethodProcess()
    {
        //取号
        System.out.println("-----take number--"+this.takeNumber());
        //子类具体业务
        this.transact();
        //检查是否可以钩子方法
        if(this.isEvaluateHook())
        {
            //执行
            this.evaluateHook();
        }
        
    }
    
    /**
     * 具体交易由子类实现
     */
    protected abstract void transact();
    
    //取号
    public int takeNumber()
    {
        return ++number;
    }
    
    //是否启用钩子方法--可以用于子类定义是否执行自定义方法
    protected boolean isEvaluateHook()
    {
        return true;
    }
    
    //钩子方法
    protected void evaluateHook()
    {
        System.out.println("evaluateHook");
    }
    
}
