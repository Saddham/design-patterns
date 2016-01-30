package com.designpatterns.creational.objectpool;

public class DriverManager {
	
	private DriverManager(){			
	}
	
	public static Connection getConnection(String url, String user, String pwd){
		System.out.println("Creating connection for " + "url: " + url 
				+ "user: " + user);
		return new Connection();
	}
}
