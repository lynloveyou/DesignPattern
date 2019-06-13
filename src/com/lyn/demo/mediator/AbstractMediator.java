package com.lyn.demo.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMediator implements Mediator{
    //设置对应关系
    public static Map<String,String> mapper = new HashMap<String,String>();
    //设置具体关联关系
    static {
        mapper.put("ConcreteColleague1", "ConcreteColleague2");
        mapper.put("ConcreteColleague2", "ConcreteColleague3");
        mapper.put("ConcreteColleague3", "ConcreteColleague1");
    }
    
    //设置缓存对象
    public static Map<String,Colleague> cacheObject = new HashMap<String,Colleague>();
    
    @Override
    public void register(Colleague colleague){
        cacheObject.put(colleague.getClass().getSimpleName(), colleague);
    }
}
