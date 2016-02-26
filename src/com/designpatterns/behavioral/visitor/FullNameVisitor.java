package com.designpatterns.behavioral.visitor;

public class FullNameVisitor implements Visitor{

	@Override
	public void visit(Employee employee) {
		System.out.println(employee.getFirstName()+" "+employee.getLastName());
	}

	@Override
	public void visit(Manager manager) {
		System.out.println(manager.getFirstName()+" "+manager.getLastName());		
	}

}
