package com.designpatterns.creational.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<Type> {
	private long expirationTime;
	private Hashtable<Type, Long> locked, unlocked;
	
	public ObjectPool(){
		expirationTime = 30000;
		locked = new Hashtable<Type, Long>();
		unlocked = new Hashtable<Type, Long>();
	}
	
	protected abstract Type create();
	protected abstract void expire(Type type);
	protected abstract boolean validate(Type type);
	
	public synchronized Type checkOut(){
		Long currentTime = System.currentTimeMillis();
		Type type = null;
		
		if(unlocked.size() > 0){
			Enumeration<Type> keys = unlocked.keys();
			while(keys.hasMoreElements()){
				Type unlockedType = keys.nextElement();
				if((currentTime-unlocked.get(unlockedType)) > expirationTime){
					unlocked.remove(unlockedType);
					expire(unlockedType);
				} else{
					if(validate(unlockedType)){
						unlocked.remove(unlockedType);
						locked.put(unlockedType, currentTime);
						return unlockedType;
					} else{
						unlocked.remove(unlockedType);
						expire(unlockedType);
					}
				}
				
			}
		}
		
		type = create();
		locked.put(type, currentTime);
		
		return type;
	}
	
	public synchronized void checkIn(Type type){
		locked.remove(type);
		unlocked.put(type, System.currentTimeMillis());
	}
	
}
