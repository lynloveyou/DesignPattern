package com.lyn.demo.observerAndMediator;

import com.lyn.demo.observerAndMediator.impl.SubjectObservableImpl;
import com.lyn.demo.observerAndMediator.impl.SubjectObservableMediatorImpl;
import com.lyn.demo.observerAndMediator.impl.SubjectObserverAndObservableImpl;
import com.lyn.demo.observerAndMediator.impl.SubjectObserverImpl;

public class Client {
	/**
	 * Observers模式与Mediator模式合并使用
	 */
	public static void main(String[] args) {
		// 获取中介者
		SubjectObservableMediator mediator = SubjectObservableMediatorImpl.getInstance();
		// 创建主题发布者 主题为topic1
		SubjectObservableImpl observable = new SubjectObservableImpl(mediator, "topic1");
		// 创建主题监听者 监听主题topic1
		SubjectObserverImpl observer1 = new SubjectObserverImpl(mediator, "topic1");
		observer1.setName("监听者1");
		// 设置即使监听者又是具体主题发布者  监听主题topic1 ,自己的主题topic2
		SubjectObserverAndObservableImpl soaoi =
							new SubjectObserverAndObservableImpl(mediator, "topic1", "topic2");
		soaoi.setName("双重身份监听者发布者");
		// 创建主题监听者 监听主题topic1
		SubjectObserverImpl observer2 = new SubjectObserverImpl(mediator, "topic2");
		observer2.setName("监听者2");
		//开始注册监听者
		mediator.attachObserver(observer1);
		mediator.attachObserver(observer2);
		mediator.attachObserver(soaoi);
		//开始注册号发布者
		mediator.attachSubjectObservable(observable);
		mediator.attachSubjectObservable(soaoi);
		//开始发消息
		observable.sendMsg("测试消息1");
		soaoi.sendMsg("测试消息2");
	}

}
