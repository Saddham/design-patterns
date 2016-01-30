package com.designpatterns.creational.builder;

public class HawaiinPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {		
		pizza.setDough("cross");
	}

	@Override
	public void buildSauce() {		
		pizza.setSauce("mild");		
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("ham+pineaple");
	}

}
