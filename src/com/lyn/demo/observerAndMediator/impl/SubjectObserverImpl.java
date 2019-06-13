package com.lyn.demo.observerAndMediator.impl;

import com.lyn.demo.observerAndMediator.SubjectObservableMediator;
import com.lyn.demo.observerAndMediator.SubjectObserver;

/**
 * 具体观察者
 */

public class SubjectObserverImpl extends AbstractSubjectObserver implements SubjectObserver {
	//对象名称
	private String name;
	
	public SubjectObserverImpl(SubjectObservableMediator observableMediator) {
		super(observableMediator);
	}
	

	public SubjectObserverImpl(SubjectObservableMediator observableMediator, String observerTopic) {
		super(observableMediator, observerTopic);
	}


	@Override
	public void notify(String msg) {
		System.out.println("----SubjectObserverImpl:"+this.getName()+"-----获得信息-----:" + msg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
