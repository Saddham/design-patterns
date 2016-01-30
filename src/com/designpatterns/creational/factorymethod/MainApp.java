package com.designpatterns.creational.factorymethod;

public class MainApp {

	public static void main(String[] args) {
		AbstractShapeFactory shapeFactory = RectangleFactory.getInstance();
		Shape shape = shapeFactory.createShape();
		
		System.out.println(shape.ghanta());
	}

}
