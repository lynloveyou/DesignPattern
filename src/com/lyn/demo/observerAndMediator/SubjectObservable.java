package com.lyn.demo.observerAndMediator;

/**
 * 被观察者
 * @author lyn
 *
 */
public interface SubjectObservable {
	
	/**
	 * 获取自己的主题，给观察者观察的主题
	 */
	public String getSelfTopic();
	
	/**
	 * 发出消息
	 * @param msg
	 */
	public void sendMsg(String msg);
	
	/**
	 * 获取观察者的中介者
	 */
	public SubjectObservableMediator getObservableMediator();
	
	
	
}
