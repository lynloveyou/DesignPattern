package com.lyn.demo.facade;

public interface SwitchFacade {
	
	//打开开关
	public static final int MACHINE_ON=1;
	
	//关闭开关
	public static final int MACHINE_OFF=0;
	/**
	 * 白天开关机器
	 * @param operator
	 */
	public void machineTakeOnDay(int operator);
	
	/**
	 * 晚上开关机器
	 * @param operator
	 */
	public void machineTakeOnNight(int operator);
}
