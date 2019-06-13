package com.lyn.demo.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.lyn.demo.strategy.service.TravelStrategy;
import com.lyn.demo.strategy.service.impl.AirplaneStrategy;
import com.lyn.demo.strategy.service.impl.BicycleStrategy;
import com.lyn.demo.strategy.service.impl.TrainStrategy;

public class PersonContext {
	/**
	 * 飞机 1
	 */
	public static int STRATEGY_AIRPLANE = 1;

	/**
	 * 火车 2
	 */
	public static int STRATEGY_TRAIN = 2;

	/**
	 * 单车 4
	 */
	public static int STRATEGY_BICYCLE = 4;

	// 初始化算法容器
	public static Map<Integer, TravelStrategy> strategyMap = new HashMap<Integer, TravelStrategy>();

	// 静态初始化算法
	static {
		strategyMap.put(PersonContext.STRATEGY_BICYCLE, new BicycleStrategy());
		strategyMap.put(PersonContext.STRATEGY_AIRPLANE, new AirplaneStrategy());
		strategyMap.put(PersonContext.STRATEGY_TRAIN, new TrainStrategy());

	}

	private TravelStrategy travelStrategy;

	public PersonContext(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}

	public TravelStrategy getTravelStrategy() {
		return travelStrategy;
	}

	public void setTravelStrategy(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}

	public void travel() {
		this.travelStrategy.travel();
	}

	public void travel(int travelValue) {
		Set<Integer> keySet = strategyMap.keySet();
		Integer[] array = keySet.toArray(new Integer[keySet.size()]);
		Arrays.sort(array);
		List<Integer> strategeList = new ArrayList<Integer>();
		for (int i=array.length-1;i>=0;i--) {
			Integer key = array[i];
			if(key==travelValue)
			{
				strategeList.add(key);
				break;
			}
			boolean compareValue = travelValue>=key;
			travelValue =compareValue?travelValue % key:travelValue;
			if(travelValue>0&&compareValue)
			{
				strategeList.add(key);
			}
		}
		Collections.sort(strategeList);
		for(Integer travelMethod:strategeList)
		{
			TravelStrategy travel = strategyMap.get(travelMethod);
			travel.travel();
		}
	}
}
