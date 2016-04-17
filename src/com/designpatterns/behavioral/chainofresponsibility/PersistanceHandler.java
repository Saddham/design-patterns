package com.design.patterns.behavioral.chainofresponsibility;

/**
 * Created by saddhamp on 8/3/16.
 */
public class PersistanceHandler extends Handler {
    @Override
    public void handle(Request request) {
        System.out.println(request.getFullName());
        System.out.println(request.getBenefits().toString());

        if (nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
