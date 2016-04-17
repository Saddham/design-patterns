package com.design.patterns.behavioral.chainofresponsibility;

/**
 * Created by saddhamp on 8/3/16.
 */
public class MainApp {

    public static void main(String [] args){
        Handler headHandler = new ValidationHandler();
        Handler handler = headHandler;
        Handler nextHandler = new FullNameHandler();
        handler.add(nextHandler);
        handler = nextHandler;
        nextHandler = new BenefitsHandler();
        handler.add(nextHandler);
        handler = nextHandler;
        nextHandler = new PersistanceHandler();
        handler.add(nextHandler);

        Request request = new Request();
        request.setFirstName("Saddam");
        request.setLastName("Pathan");
        request.setDesignation(Designation.PRINCIPAL_DEVELOPMENT_ENGINEER);
        headHandler.handle(request);
    }
}
