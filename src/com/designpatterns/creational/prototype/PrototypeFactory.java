package com.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	private static Map<String, Prototype> prototypeRegistry = 
			new HashMap<String, Prototype>();
	
	static {
		prototypeRegistry.put(ModelType.MUSIC, new Music());
		prototypeRegistry.put(ModelType.ALBUM, new Album());
		prototypeRegistry.put(ModelType.MOVIE, new Movie());
	}
	
	public static Prototype getInstance(final String modelType) throws CloneNotSupportedException{
		return prototypeRegistry.get(modelType).clone(); 
	}
	
	
	public static class ModelType{
		public static final String MUSIC = "MUSIC";
		public static final String ALBUM = "ALBUM";
		public static final String MOVIE = "MOVIE";
	}
}
