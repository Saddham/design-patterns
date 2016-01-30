package com.designpatterns.creational.prototype;

public class Music implements Prototype {
	private String name;
	
	public Music(){
		System.out.println("Music created");
	}
	
	public Music clone() throws CloneNotSupportedException{
		return (Music)super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {		
		return "Music: " + name;
	}
}
