package com.designpatterns.creational.factorymethod;

public class RectangleFactory extends AbstractShapeFactory {
	private static RectangleFactory rectangleFactory = new RectangleFactory();
	
	private RectangleFactory(){
		
	}
	
	public static RectangleFactory getInstance(){
		return rectangleFactory;
	}
	
	@Override
	public Shape createShape() {
		return new Rectangle();
	}
}
