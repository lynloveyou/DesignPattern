package com.lyn.demo.interceptingFilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain{
    private List<Filter> chain;
    private Target target;
    public FilterChain(){
        this.chain = new ArrayList<Filter>();
    }
    
    public void execute(String request)
    {
        //首先执行过滤器
        for(Filter filter:chain)
        {
            filter.execute(request); 
        }
        //在执行实际工作目标程序
        target.execute(request);
    }
    
    public void addFilter(Filter filter)
    {
        chain.add(filter);  
    }
    
    public void setTarget(Target target){
        this.target = target;
    }
    
    
    
}
