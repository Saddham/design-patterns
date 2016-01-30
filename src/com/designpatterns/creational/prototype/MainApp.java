package com.designpatterns.creational.prototype;

import com.designpatterns.creational.prototype.PrototypeFactory.ModelType;

public class MainApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		//returns cloned object
		Prototype music = PrototypeFactory.getInstance(ModelType.MUSIC);
		music.setName("Pehli Bar");
		System.out.println(music.toString());
		
		//returns cloned object
		music = PrototypeFactory.getInstance(ModelType.MUSIC);
		music.setName("Dil Dhadkane Do");
		System.out.println(music.toString());
	}

}
