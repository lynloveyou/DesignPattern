package com.lyn.demo.observerAndMediator;

/**
 * 观察者
 * @author lyn
 */
public interface SubjectObserver {
	
	/**
	 * 获取观察的主题
	 * @return
	 */
	public String getObserverTopic();
	
	/**
	 * 获取观察者的中介者
	 */
	public SubjectObservableMediator getObservableMediator();
	
	/**
	 * 得到通知消息
	 * @param msg
	 */
	public void notify(String msg);
}
