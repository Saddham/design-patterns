package com.designpatterns.structural.adapter;

public class MainApp {

	public static void main(String[] args) {		
		Shape shape = new Line();
		shape.draw(54, 86, 67, 98);
		
		shape = new Rectangle();
		shape.draw(68, 79, 86, 59);
	}

}
