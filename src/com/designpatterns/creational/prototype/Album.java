package com.designpatterns.creational.prototype;

public class Album implements Prototype {
	private String name;
	
	public Album(){
		System.out.println("Album created");
	}
	
	public Album clone() throws CloneNotSupportedException{
		return (Album)super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Album" + name;
	}
}
