package com.designpatterns.creational.builder;

public class MainApp {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		waiter.setPizzaBuilder(new HawaiinPizzaBuilder());
		waiter.constructPizza();
		Pizza pizza = waiter.getPizza();
		System.out.println(pizza.getDough());
		System.out.println(pizza.getSauce());
		System.out.println(pizza.getTopping());

	}

}
