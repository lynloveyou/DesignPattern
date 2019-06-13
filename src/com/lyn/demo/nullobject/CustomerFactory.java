package com.lyn.demo.nullobject;

/**
 *生成客户的工厂方法 
 */
public class CustomerFactory{
    private static String[] names = new String[]{"john","cristina","solr","siri","tmjl"};
    
    public static AbstractCustomer getCustomer(String name)
    {
        for(String namekey:names)
        {
            if(namekey.equalsIgnoreCase(name))
            {
                return new RealCustomer(name);
            }
        }
        return new NullCustoemr();
    }
    
}
