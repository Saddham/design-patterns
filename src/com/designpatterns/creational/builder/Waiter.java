package com.designpatterns.creational.builder;

public class Waiter {
	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public void constructPizza(){
		pizzaBuilder.createNewPizza();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
	
	public Pizza getPizza(){
		return pizzaBuilder.getPizza();
	}
}
