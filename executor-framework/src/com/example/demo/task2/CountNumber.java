package com.example.demo.task2;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CountNumber implements Callable<Integer> {
	
	private int countTo;
	

	public CountNumber(int countTo) {
		super();
		this.countTo = countTo;
	}


	@Override
	public Integer call() throws Exception {

		int total =0;
		for(int idx=0;idx<=10;idx++) {
			total+=idx;
		}
		TimeUnit.SECONDS.sleep(5);
		
		return total;
	}

	
}
