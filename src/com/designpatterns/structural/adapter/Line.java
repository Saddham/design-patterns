package com.designpatterns.structural.adapter;

public class Line implements Shape{
	private LegacyLine legacyLine = new LegacyLine();
	
	@Override
	public void draw(double x1, double y1, double x2, double y2) {		
		legacyLine.draw(x1, y1, x2, y2);
	}

}
