package com.lyn.demo.observerAndMediator.impl;

import com.lyn.demo.observerAndMediator.SubjectObservable;
import com.lyn.demo.observerAndMediator.SubjectObservableMediator;

public abstract class AbstractSubjectObservable implements SubjectObservable {
	//观察者模式的中介者对象
	private SubjectObservableMediator observableMediator;
	//设置自己的主题供他人监听
	private String selfTopic;
	
	/**
	 * 设置观察模式的中介者
	 * @param observableMediator
	 */
	public AbstractSubjectObservable(SubjectObservableMediator observableMediator) {
		this(observableMediator, "");
	}
	

	public AbstractSubjectObservable(SubjectObservableMediator observableMediator, String selfTopic) {
		this.observableMediator = observableMediator;
		this.selfTopic = selfTopic;
	}


	@Override
	public SubjectObservableMediator getObservableMediator() {
		return this.observableMediator;
	}


	@Override
	public String getSelfTopic() {
		return this.selfTopic;
	}

}
