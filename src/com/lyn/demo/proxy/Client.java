package com.lyn.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

  /**
   * 适用性
	*在需要用比较通用和复杂的对象指针代替简单的指针的时候，使用 Proxy模式。下面是一些可以使用Proxy模式常见情况：
	*1) 远程代理（Remote  Proxy）为一个位于不同的地址空间的对象提供一个本地的代理对象。这个不同的地址空间可以是在同一台主机中，
	*   也可是在另一台主机中，远程代理又叫做大使(Ambassador)
	*2) 虚拟代理（Virtual Proxy）根据需要创建开销很大的对象。如果需要创建一个资源消耗较大的对象，先创建一个消耗相对较小的对象来表示，
	*	真实对象只在需要时才会被真正创建。 
	*3) 保护代理（Protection Proxy）控制对原始对象的访问。保护代理用于对象应该有不同的访问权限的时候。
	*4) 智能指引（Smart Reference）取代了简单的指针，它在访问对象时执行一些附加操作。
	*5) Copy-on-Write代理：它是虚拟代理的一种，把复制（克隆）操作延迟到只有在客户端真正需要时才执行。
	*	一般来说，对象的深克隆是一个开销较大的操作，Copy-on-Write代理可以让这个操作延迟，只有对象被用到的时候才被克隆。
    * 
    * 
    * 模式的组成
	* 1)代理角色(Proxy):
	*	. 保存一个引用使得代理可以访问实体。若 RealSubject和Subject的接口相同，Proxy会引用Subject。
	*	. 提供一个与Subject的接口相同的接口，这样代理就可以用来替代实体。
	*	. 控制对实体的存取，并可能负责创建和删除它。
	*	. 其他功能依赖于代理的类型：
	*	• Remote Proxy负责对请求及其参数进行编码，并向不同地址空间中的实体发送已编码的请求。
	*	• Virtual Proxy可以缓存实体的附加信息，以便延迟对它的访问。
	*	• Protection Proxy检查调用者是否具有实现一个请求所必需的访问权限。
	*
	*	2) 抽象主题角色(Subject):定义真实主题角色RealSubject
	*	      和 抽象主题角色Proxy的共用接口，这样就在任何使用RealSubject的地方都可以使
	*	      用Proxy。代理主题通过持有真实主题RealSubject的引用,不但可以控制真实主题RealSubject的创建或删除,
	*      可以在真实主题RealSubject被调用前进行拦截,或在调用后进行某些操作. 
	*	3) 真实主题角色(RealSubject):定义了代理角色(proxy)所代表的具体对象. 
	*/
	public static void main(String[] args) {
		//--------静态代理模式----
		System.out.println("==========static proxy==========");
		Weather weather = new WeatherProxy();
		weather.request("employee", "shenzhen");
		weather.display("employee", "shenzhen");
		weather.request("boss", "shenzhen");
		weather.display("boss", "shenzhen");
		//--------动态代理模式----
		System.out.println("==========dynamic proxy==========");
		//设置生成代理$proxy的class文件
		System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		InvocationHandler invocationHandler = new WeatherDynamicInvocationHandler(weather);
		ClassLoader classLoader = Weather.class.getClassLoader();
		System.out.println(classLoader);
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		System.out.println(systemClassLoader);
		System.out.println(classLoader.equals(systemClassLoader));
		System.out.println(systemClassLoader==classLoader);
		Weather dynamicProxy = (Weather)Proxy.newProxyInstance(classLoader, 
															new Class[]{Weather.class},invocationHandler);
		dynamicProxy.request("employee", "shenzhen");
		dynamicProxy.display("employee", "shenzhen");
		dynamicProxy.request("boss", "shenzhen");
		dynamicProxy.display("boss", "shenzhen");
		//日志代理
		LogInvocationHandler lih = new LogInvocationHandler();
		Weather newProxyInstance = (Weather)lih.newProxyInstance(weather);
		newProxyInstance.request("boss", "shenzhen");
		newProxyInstance.display("boss", "shenzhen");
	}

}
