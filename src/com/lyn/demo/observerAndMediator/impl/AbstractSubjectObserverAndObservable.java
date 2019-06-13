package com.lyn.demo.observerAndMediator.impl;

import com.lyn.demo.observerAndMediator.SubjectObservable;
import com.lyn.demo.observerAndMediator.SubjectObservableMediator;
import com.lyn.demo.observerAndMediator.SubjectObserver;

/**
 * 即是抽象观察者也是抽象主题
 */
public abstract class AbstractSubjectObserverAndObservable implements SubjectObserver,SubjectObservable{
	//设置观察的主题
	private String observerTopic;
	//观察者模式的中介者对象
	private SubjectObservableMediator observableMediator;
	//设置自己的主题供他人监听
	private String selfTopic;
	
	/**
	 * 
	 * @param observableMediator 通知关系中介者
	 */
	public AbstractSubjectObserverAndObservable(SubjectObservableMediator observableMediator)
	{
		this(observableMediator, "", "");
	}
	/**
	 * 
	 * @param observableMediator 通知关系中介者
	 * @param topic 需要观察的主题
	 */
	public AbstractSubjectObserverAndObservable(SubjectObservableMediator observableMediator,String observerTopic)
	{
		this(observableMediator, observerTopic, "");
	}
	
	/**
	 * 
	 * @param observableMediator 通知关系中介者
	 * @param topic 需要观察的主题
	 * @param selfTopic
	 */
	public AbstractSubjectObserverAndObservable(SubjectObservableMediator observableMediator,String observerTopic,String selfTopic)
	{
		this.observerTopic=observerTopic;
		this.observableMediator = observableMediator;
		this.selfTopic = selfTopic;
	}
	
	
	//------------------Override by SubjectObserver------------
	/**
	 * 获取观察监听的主题
	 * @return
	 */
	@Override
	public String getObserverTopic() {
		return this.observerTopic;
	}
	
	//------------------Override by SubjectObservable------------
	/**
	 * 获取自己的主题供他人监听
	 * @return
	 */
	@Override
	public String getSelfTopic() {
		return this.selfTopic;
	}
	
	/**
	 * 设置自己的主题
	 * @param selfTopic 设置自己的主题
	 */
	public void setSelfTopic(String selfTopic) {
		this.selfTopic = selfTopic;
	}
	
	/**
	 * 设置观察的主题
	 * @param observerTopic 设置观察的主题
	 */
	public void setObserverTopic(String observerTopic) {
		this.observerTopic = observerTopic;
	}
	/**
	 * 获取观察者的中介者
	 */	
	@Override
	public SubjectObservableMediator getObservableMediator() {
		return this.observableMediator;
	}
}
