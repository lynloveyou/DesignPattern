package com.lyn.demo.businessDelegate;

import com.lyn.demo.businessDelegate.impl.EJBService;
import com.lyn.demo.businessDelegate.impl.JMSService;
import com.lyn.demo.businessDelegate.impl.NullService;

public class BusinessLookUp{
    
    public BusinessService lookUp(String serviceType)
    {
        if("EJB".equalsIgnoreCase(serviceType))
        {
            return new EJBService();
        }
        if("JMS".equalsIgnoreCase(serviceType))
        {
            return new JMSService();
        }
        return new NullService();
    }
}
