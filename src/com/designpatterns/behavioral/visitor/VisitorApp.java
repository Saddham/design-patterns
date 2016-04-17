package com.designpatterns.behavioral.visitor;

public class VisitorApp {

	public static void main(String[] args) {		
		Visitor visitor = new FullNameVisitor();
		 
		Employee employee = new Employee();
		employee.setFirstName("Saddam");
		employee.setLastName("Pathan");
		employee.accept(visitor);
		
		Manager manager = new Manager();
		manager.setFirstName("Sid");
		manager.setLastName("Sharma");
		manager.accept(visitor);
	}

}
