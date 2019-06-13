package com.lyn.demo.builder;

public class Client{
    /**
     * 适用性
		在以下情况使用Builder模式
		•当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
		•当构造过程必须允许被构造的对象有不同的表示时。
     * 
     * 构建模式的组成
     * • 抽象建造者角色（Builder）：为创建一个Product对象的各个部件指定抽象接口，以规范产品对象的各个组成成分的建造。一般而言，此角色规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建。
     * • 具体建造者（ConcreteBuilder）
     * 1) 实现Builder的接口以构造和装配该产品的各个部件。即实现抽象建造者角色Builder的方法。
     * 2)  定义并明确它所创建的表示，即针对不同的商业逻辑，具体化复杂对象的各部分的创建
     * 3)  提供一个检索产品的接口
     * 4)  构造一个使用Builder接口的对象即在指导者的调用下创建产品实例
     * 
     * • 指导者（Director）：调用具体建造者角色以创建产品对象的各个部分。指导者并没有涉及具体产品类的信息，真正拥有具体产品的信息是具体建造者对象。它只负责保证对象各部分完整创建或按某种顺序创建。
     * • 产品角色（Product）：建造中的复杂对象。它要包含那些定义组件的类，包括将这些组件装配成产品的接口。
     */
    public static void main(String[] args){
        //第一种指导者什么都卖
        buy("A");
        buy("B");
        //第二种指导者不卖饮料
        buy2("A");
        buy2("B");
    }
    
    public static void buy(String type)
    {
       try{
           Class clazz = Class.forName("com.lyn.demo.builder.impl.ConcreteBuilder"+type);
           Builder builder = (Builder)clazz.newInstance();
           System.out.println("=========指导者1=========生成"+type+"套餐===============");
           Director director = new Director();
           director.buildFood(builder);
           director.getProduct().showToClient();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
    
    public static void buy2(String type)
    {
       try{
           Class clazz = Class.forName("com.lyn.demo.builder.impl.ConcreteBuilder"+type);
           Builder builder = (Builder)clazz.newInstance();
           System.out.println("=========指导者2=========生成"+type+"套餐===============");
           Director2 director2 = new Director2();
           director2.buildFood(builder);
           director2.getProduct().showToClient();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
