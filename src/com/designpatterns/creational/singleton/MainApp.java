package com.designpatterns.creational.singleton;

public class MainApp {

	public static void main(String[] args) {
		Thread t1 = new Thread(new SingletonThread("singleton"));
		Thread t2 = new Thread(new SingletonThread("saddam"));
		
		t1.start();
		t2.start();
	}

}
