package com.designpatterns.creational.prototype;

public interface Prototype extends Cloneable {
	public Prototype clone() throws CloneNotSupportedException;
	public String getName();
	public void setName(String name);
}
