package com.designpatterns.creational.objectpool;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {
		
		JDBCConnectionPool jPool = new JDBCConnectionPool("com.designpatterns.creational.objectpool.Driver",
										"jdbc:mysql://localhost/EM", "user", "pwd");
		
		System.out.println("first checkout:");
		Connection connection = jPool.checkOut();
		
		System.out.println("first checkin:");
		jPool.checkIn(connection);
		
		System.out.println("Second checkout: returns old connection");
		connection = jPool.checkOut();
		
		Thread.sleep(30000);
		
		System.out.println("third checkout: return new connection");
		connection = jPool.checkOut();
	}

}
