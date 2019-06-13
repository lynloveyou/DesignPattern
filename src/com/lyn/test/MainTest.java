package com.lyn.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MainTest {
	 //   alt+/
	 public static void main(String[] args) {
		double d = 16.0;
		System.out.println(Double.toHexString(d));
		int i = 16;
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.parseInt("11", 16));
		//
		Map<String,Integer> map = new HashMap<String,Integer>();
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		Calendar instance = Calendar.getInstance();
/*		System.out.println(instance.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date now =new Date();
		Calendar.getInstance();
		instance.setTime(now);*/
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			instance.setTime(sdf.parse("2018-11-18"));
			System.out.println("--sunday--"+instance.get(Calendar.DAY_OF_WEEK));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		instance.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(instance.get(Calendar.DAY_OF_WEEK));
		
		
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("456");
		list.add("789");
		List<String> list2 = new ArrayList<String>();
		list2.add("456");
		list.removeAll(list2);
		System.out.println(list);
		out:for(int j=0;j<10;j++)
		{
			for(int k=0;k<10;k++)
			{
				System.out.println("---k:"+k);
				if(k==5)
				{
					break out;
				}
			}
		}
		String[] ids = new String[]{"1","2","3","4","5"};
		String[] copyOfRange = Arrays.copyOfRange(ids, 0, 2);
		String[] copyOfRange2 = Arrays.copyOfRange(ids, 2, ids.length);
		System.out.println(copyOfRange.toString());
		System.out.println(copyOfRange2.toString());
		ConcurrentMap<String,Boolean> concurrentMap = new ConcurrentHashMap<String,Boolean>();
		System.out.println(concurrentMap.getOrDefault("123", Boolean.FALSE));
		System.out.println(concurrentMap.putIfAbsent("123", Boolean.TRUE));
		System.out.println(concurrentMap.getOrDefault("123", Boolean.FALSE));
		System.out.println("1.2.0".compareTo("1.1.9"));
        List<String> sort = new ArrayList<String>();
        sort.add("0#");
        sort.add("95#");
        sort.add("98#");
        sort.add("92#");
        Collections.sort(sort);
        System.out.println(sort.toString());
        }
}
