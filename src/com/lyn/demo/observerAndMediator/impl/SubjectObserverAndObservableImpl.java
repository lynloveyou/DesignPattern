package com.lyn.demo.observerAndMediator.impl;

import com.lyn.demo.observerAndMediator.SubjectObservable;
import com.lyn.demo.observerAndMediator.SubjectObservableMediator;
import com.lyn.demo.observerAndMediator.SubjectObserver;

/**
 * 即是抽象观察者也是抽象主题具体实现
 */
public class SubjectObserverAndObservableImpl extends AbstractSubjectObserverAndObservable
		implements SubjectObserver, SubjectObservable {
	//对象名称
	private String name;

	public SubjectObserverAndObservableImpl(SubjectObservableMediator observableMediator) {
		super(observableMediator);
	}

	public SubjectObserverAndObservableImpl(SubjectObservableMediator observableMediator, String topic) {
		super(observableMediator, topic);
	}

	public SubjectObserverAndObservableImpl(SubjectObservableMediator observableMediator, String observerTopic,
			String selfTopic) {
		super(observableMediator, observerTopic, selfTopic);
	}

	@Override
	public void sendMsg(String msg) {
		this.getObservableMediator().notifyAllObserver(this, msg);
	}

	public void notify(String msg) {
		System.out.println("----SubjectObserverAndObservableImpl:"+this.getName()+"-----获得信息-----:" + msg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
