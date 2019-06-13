package com.lyn.demo.observerAndMediator.impl;

import com.lyn.demo.observerAndMediator.SubjectObservableMediator;
import com.lyn.demo.observerAndMediator.SubjectObserver;

public abstract class AbstractSubjectObserver implements SubjectObserver {
	//观察者模式的中介者对象
	private SubjectObservableMediator observableMediator;
	//设置观察的主题
	private String observerTopic;
	
	/**
	 * 设置观察模式的中介者
	 * @param observableMediator
	 */
	public AbstractSubjectObserver(SubjectObservableMediator observableMediator) {
		this(observableMediator, "");
	}
	

	public AbstractSubjectObserver(SubjectObservableMediator observableMediator, String observerTopic) {
		this.observableMediator = observableMediator;
		this.observerTopic = observerTopic;
	}


	@Override
	public SubjectObservableMediator getObservableMediator() {
		return this.observableMediator;
	}


	@Override
	public String getObserverTopic() {
		return this.observerTopic;
	}
	
	

}
