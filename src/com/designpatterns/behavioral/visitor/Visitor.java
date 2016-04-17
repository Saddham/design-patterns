package com.designpatterns.behavioral.visitor;

public interface Visitor {
	public void visit(Employee employee);
	public void visit(Manager manager);
}
