package com.example.demo.task1;
import java.util.concurrent.*;

public class Application {

	public static void usingFixedThreadExecutor() {
		
		int  processorCount = Runtime.getRuntime().availableProcessors();
		
		System.out.println("Processor Count:="+processorCount);
		
		ExecutorService service = 
				
				 Executors.newFixedThreadPool(3);
		
		UsingPringString[] tasks =
			{
					new  UsingPringString("Idly","Sambar"),
					new  UsingPringString("Pizza","Coke"),
					new  UsingPringString("Partha","Achar"),
					new  UsingPringString("Tea","Biscut")
			};
		
		for(UsingPringString eachTask:tasks) {
			
		service.submit(eachTask);
			
		}

		service.shutdown();

	

	}
	public static void usingSingleThreadExecutor() {
		
		ExecutorService service = 
				
				 Executors.newSingleThreadExecutor();
		
		UsingPringString[] tasks =
			{
					new  UsingPringString("Idly","Sambar"),
					new  UsingPringString("Pizza","Coke"),
					new  UsingPringString("Partha","Achar"),
					new  UsingPringString("Tea","Biscut")
			};
		
		for(UsingPringString eachTask:tasks) {
			
		service.submit(eachTask);
			
		}

		service.shutdown();

	}
	
	public static void main(String[] args) {

		// usingSingleThreadExecutor();
		
		   usingFixedThreadExecutor();
		
		 
			}

}
