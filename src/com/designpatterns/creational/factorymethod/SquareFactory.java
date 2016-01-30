package com.designpatterns.creational.factorymethod;

public class SquareFactory extends AbstractShapeFactory {
	private static SquareFactory squareFactory = new SquareFactory();
	
	private SquareFactory(){
		
	}
	
	public static SquareFactory getInstance(){
		return squareFactory;
	}
	
	@Override
	public Shape createShape() {
		return new Square();
	}
}
