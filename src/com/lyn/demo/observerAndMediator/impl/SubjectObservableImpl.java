package com.lyn.demo.observerAndMediator.impl;

import com.lyn.demo.observerAndMediator.SubjectObservable;
import com.lyn.demo.observerAndMediator.SubjectObservableMediator;

/**
 * 具体目标 被观察者 
 */
public class SubjectObservableImpl extends AbstractSubjectObservable implements SubjectObservable {

	public SubjectObservableImpl(SubjectObservableMediator observableMediator) {
		super(observableMediator);
	}
	

	public SubjectObservableImpl(SubjectObservableMediator observableMediator, String selfTopic) {
		super(observableMediator, selfTopic);
	}

	@Override
	public void sendMsg(String msg) {
		this.getObservableMediator().notifyAllObserver(this, msg);
	}

}
