package com.lyn.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class LogInvocationHandler implements InvocationHandler{
    private Object targetObject;

    public Object newProxyInstance(Object targetObject)
    {
           this.targetObject=targetObject;
           Class targetClazz = targetObject.getClass();
           Object newProxyInstance = Proxy.newProxyInstance(targetClazz.getClassLoader(),
                       targetClazz.getInterfaces(), this);
           return newProxyInstance;
    }
    
    @Override
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
        System.out.println("----------控制访问权限---------"+System.currentTimeMillis());
        Object ret = method.invoke(targetObject, args);
        System.out.println("----------记录日志---------"+System.currentTimeMillis());
        return ret;
    }
}
