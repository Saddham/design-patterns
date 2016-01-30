package com.designpatterns.creational.prototype;

public class Movie implements Prototype {
	private String name;
	
	public Movie(){
		System.out.println("Movie created");
	}
	
	public Movie clone() throws CloneNotSupportedException{
		return (Movie)super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Movie" + name;
	}
}
