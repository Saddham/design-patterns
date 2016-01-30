package com.designpatterns.creational.singleton;

public class SingletonThread implements Runnable {
	private String name;
	
	public SingletonThread(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		Singleton singleton = Singleton.getInstance();
		singleton.setName(name);
		if("singleon".equalsIgnoreCase(name)){
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(singleton.getName());
		

	}
}
