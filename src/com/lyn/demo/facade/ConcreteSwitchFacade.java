package com.lyn.demo.facade;

import java.util.ArrayList;
import java.util.List;

import com.lyn.demo.facade.impl.AirConditioner;
import com.lyn.demo.facade.impl.Light;
import com.lyn.demo.facade.impl.TV;
import com.lyn.demo.facade.impl.WIFIConditioner;

public class ConcreteSwitchFacade implements SwitchFacade {
	private static ConcreteSwitchFacade csf;
	private ConcreteSwitchFacade(){};
	private static List<Machine> machines = new ArrayList<Machine>();
	static{
		machines.add(new AirConditioner());
		machines.add(new Light());
		machines.add(new TV());
		machines.add(new WIFIConditioner());
	}

	@Override
	public void machineTakeOnDay(int operator) {
		for(Machine machine:machines)
		{
			if(!(machine instanceof Light))
			{
				if(SwitchFacade.MACHINE_ON==operator)
				{
						machine.takeOn();
						continue;
				}
				machine.takeOff();
			}
		}
	}

	@Override
	public void machineTakeOnNight(int operator) {
		for(Machine machine:machines)
		{
			if(SwitchFacade.MACHINE_ON==operator)
			{
					machine.takeOn();
					continue;
			}
			machine.takeOff();
		}
	}

	public static synchronized ConcreteSwitchFacade  getInstance()
	{
		if(null==csf)
		{
			csf = new ConcreteSwitchFacade();
		}
		return csf;
	}
	
}
