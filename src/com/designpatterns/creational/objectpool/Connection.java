package com.designpatterns.creational.objectpool;

public class Connection {
	private Boolean closed = false;
	
	public Connection(){
		System.out.println("Connection created");
	}
	
	public void close(){
		closed = true;
		System.out.println("Connection closed");
	}
	
	public boolean isClosed(){
		return closed;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Connection){
			Connection connection = (Connection) obj;
			return this.closed == connection.closed;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		int hashCode = closed.hashCode() * 31;
		return hashCode;
	}
}
