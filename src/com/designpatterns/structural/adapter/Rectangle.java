package com.designpatterns.structural.adapter;

public class Rectangle implements Shape {
	private LegacyRectangle legacyRectangle = new LegacyRectangle();
	
	@Override
	public void draw(double x1, double y1, double x2, double y2) {
		legacyRectangle.draw(x1, y1, x2, y2);
	}

}
