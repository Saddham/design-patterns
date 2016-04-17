package com.design.patterns.behavioral.chainofresponsibility;

/**
 * Created by saddhamp on 8/3/16.
 */
public class ValidationHandler extends Handler {
    @Override
    public void handle(Request request) {
        boolean isValidRequest = true;

        if(request.getFirstName() == null || request.getFirstName().isEmpty()){
            isValidRequest = false;
        } else if(request.getLastName() == null || request.getLastName().isEmpty()){
            isValidRequest = false;
        } else if(request.getDesignation() == null){
            isValidRequest = false;
        }

        if(isValidRequest && nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
