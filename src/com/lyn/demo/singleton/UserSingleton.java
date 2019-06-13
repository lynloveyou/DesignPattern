package com.lyn.demo.singleton;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class UserSingleton {
	private static ConcurrentHashMap<String, UserSingleton> cacheObject = new ConcurrentHashMap<String, UserSingleton>();
	private String uid;
	
	private UserSingleton(String uid) {
		this.uid = uid;
	}
	
	public String getUid() {
		return uid;
	}

	public static UserSingleton getInstance(String uid)
	{
		//可以增加对单例访问控制
		if(!_vaildOAuth())
		{
			return null;
		}
		UserSingleton userSingleton = cacheObject.get(uid);
		if(userSingleton==null)
		{
			userSingleton = new UserSingleton(uid);
			cacheObject.put(uid, userSingleton); 
		}
		return userSingleton;
	}
	
	private static boolean _vaildOAuth()
	{
		return true;
	}
	
	public static void main(String[] args)
	{
		String[] uids = new String[10];
		for(int i=0;i<10;i++)
		{
			String uid = UUID.randomUUID().toString();
			uids[i] = uid;
			UserSingleton.getInstance(uid);
		}
		for(String uid:uids)
		{
			UserSingleton instance = UserSingleton.getInstance(uid);
			System.out.println(instance);
			System.out.println("------uid-------"+instance.getUid());
		}
		
	}
}
