package com.design.patterns.behavioral.command;

/**
 * Created by saddhamp on 14/3/16.
 */
public class MainApp {
    public static void main(String [] args){
        CommandApplication commandApplication = new CommandApplicationImpl();
        Request request = new Request();
        request.setFlow("test");
        Response response = commandApplication.application(request);
        if()
    }
}
