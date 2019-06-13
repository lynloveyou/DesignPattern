package com.lyn.demo.adapter;

import com.lyn.demo.adapter.clazz.AdapteeClazz;

public class AdapterClazz extends AdapteeClazz implements Target {

	@Override
	public void hello() {
		this.greet();
	}

}
