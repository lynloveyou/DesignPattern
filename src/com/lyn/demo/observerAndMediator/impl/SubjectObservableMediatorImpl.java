package com.lyn.demo.observerAndMediator.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lyn.demo.observerAndMediator.SubjectObservable;
import com.lyn.demo.observerAndMediator.SubjectObservableMediator;
import com.lyn.demo.observerAndMediator.SubjectObserver;

/**
 * 具体的中介者对象
 * 
 * @author Lyn
 */
public class SubjectObservableMediatorImpl implements SubjectObservableMediator {

	// 设置主题MAP//接受多个对象同事发送一个主题内容
	private  List<SubjectObservable> subjectObservableList = new ArrayList<SubjectObservable>();
	// 设置监听者MAP
	private  Map<String, List<SubjectObserver>> subjectObserverMap = new HashMap<String, List<SubjectObserver>>();

	//设置内部类用于获取中介者单例
	private static class SubjectObservableMediatorInnerClass {
		public static SubjectObservableMediator subjectObservableMediator = new SubjectObservableMediatorImpl();

	}
	
	//获取中介者单例
	public static SubjectObservableMediator getInstance()
	{
		return SubjectObservableMediatorInnerClass.subjectObservableMediator;
	}

	/**
	 * 增加监听对象
	 * 
	 * @param observer
	 *            监听者
	 */
	@Override
	public void attachObserver(SubjectObserver observer) {
		// 获取监听主题
		String observerTopic = observer.getObserverTopic();
		if ("".equals(observerTopic)) {
			throw new RuntimeException("订阅主题为空");
		}
		// 获取监听者列表
		List<SubjectObserver> observerList = subjectObserverMap.get(observerTopic);
		if (observerList == null) {
			observerList = new ArrayList<SubjectObserver>();
		}
		// 加入监听队列
		observerList.add(observer);
		subjectObserverMap.put(observerTopic, observerList);
	}

	/**
	 * 删除监听者
	 * 
	 * @param observer
	 *            监听者
	 */
	@Override
	public void detachObserver(SubjectObserver observer) {
		// 获取监听主题
		String observerTopic = observer.getObserverTopic();
		if ("".equals(observerTopic)) {
			throw new RuntimeException("订阅主题为空");
		}
		// 获取监听者列表
		List<SubjectObserver> observerList = subjectObserverMap.get(observerTopic);
		if (observerList == null) {
			observerList = new ArrayList<SubjectObserver>();
		}
		observerList.remove(observer);

	}

	/**
	 * 增加主题对象
	 * 
	 * @param subjectObservable
	 *            主题提供者
	 */
	@Override
	public void attachSubjectObservable(SubjectObservable subjectObservable) {
		// 获取自己的主题
		String selfTopic = subjectObservable.getSelfTopic();
		if ("".equals(selfTopic)) {
			throw new RuntimeException("自身主题为空");
		}
		if (!subjectObservableList.contains(subjectObservable)) {
			subjectObservableList.add(subjectObservable);
		}
	}

	/**
	 * 删除主题
	 * 
	 * @param subjectObservable
	 *            主题提供者
	 */
	@Override
	public void detachSubjectObservable(SubjectObservable subjectObservable) {
		if (subjectObservableList.contains(subjectObservable)) {
			subjectObservableList.remove(subjectObservable);
		}
	}

	/**
	 * 通知所有监听用户
	 * 
	 * @param observable
	 *            被监听者
	 * @param msg
	 *            发送的消息
	 */
	@Override
	public void notifyAllObserver(SubjectObservable observable, String msg) {
		if (!subjectObservableList.contains(observable)) {
			throw new RuntimeException("请先注册主题内容");
		}
		String selfTopic = observable.getSelfTopic();
		// 获取所有监听了这个主题的监听者
		List<SubjectObserver> observerList = subjectObserverMap.get(selfTopic);
		if (observerList != null) {
			for (SubjectObserver observer : observerList) {
				observer.notify(msg);
			}
		}
	}

}
