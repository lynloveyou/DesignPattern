package com.lyn.demo.observerAndMediator;

/**
 * 定义观察者模式的中介者接口
 * @author Administrator
 *
 */
public interface SubjectObservableMediator {
	
	/**
	 * 增加监听对象
	 * @param observer 监听者
	 */
	public void attachObserver(SubjectObserver observer);
	
	/**
	 * 删除监听者
	 * @param observer 监听者
	 */
	public void detachObserver(SubjectObserver observer);
	
	/**
	 * 增加主题对象
	 * @param subjectObservable 主题提供者
	 */
	public void attachSubjectObservable(SubjectObservable subjectObservable);
	
	/**
	 * 删除主题
	 * @param subjectObservable 主题提供者
	 */
	public void detachSubjectObservable(SubjectObservable subjectObservable);
	
	/**
	 * 通知所有监听用户
	 * @param observable 被监听者
	 * @param msg 发送的消息
	 */
	public void notifyAllObserver(SubjectObservable observable,String msg);

}
