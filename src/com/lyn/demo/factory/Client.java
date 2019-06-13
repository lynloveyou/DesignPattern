package com.lyn.demo.factory;

public class Client{
    /**
     * 抽象工厂模式的用意为：给客户端提供一个接口，可以创建多个产品族中的产品对象 ，而且使用抽象工厂模式还要满足一下条件：
     *1)系统中有多个产品族，而系统一次只可能消费其中一族产品。 
     *2)同属于同一个产品族的产品以其使用。 
     *
     * 抽象工厂模式的各个角色（和工厂方法一样）： 
     *1)抽象工厂角色： 这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。在java中它由抽象类或者接口来实现。 
     *2)具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。
     *3)抽象产品角色：它是具体产品继承的父类或者是实现的接口。
     *4)具体产品角色：具体工厂角色所创建的对象就是此角色的实例。
     * @param args
     */
    public static void main(String[] args){
        String type="320";
        FactoryBMW factory = getFactory(type);
        BMW createBMW = factory.createBMW(type);
        Aircondition createAirC = factory.createAirC(type); 
        type="520";
        factory = getFactory(type);
        createBMW = factory.createBMW(type);
        createAirC = factory.createAirC(type); 
    }
    
    //获取相应工厂
    public static FactoryBMW getFactory(String type)
    {
        try{
            Class clazz = Class.forName("com.lyn.demo.factory.impl.FactoryBMW"+type);
            FactoryBMW factory = (FactoryBMW)clazz.newInstance();
            return factory;
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
        return null;
    }
}
