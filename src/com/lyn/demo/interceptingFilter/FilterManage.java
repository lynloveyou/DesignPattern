package com.lyn.demo.interceptingFilter;

/**
 * 此类处理一些管理和业务相关的内容
 *
 */
public class FilterManage{
    private FilterChain filterChain;

    public FilterManage(Target target){
        this.filterChain = new FilterChain();
        this.filterChain.setTarget(target);
    }
 
    public void attachFilter(Filter filter)
    {
        filterChain.addFilter(filter);
    }
    
    public void execute(String request)
    {
        filterChain.execute(request);
    }
    
    
}
