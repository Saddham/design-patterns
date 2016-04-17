package com.design.patterns.behavioral.chainofresponsibility;

/**
 * Created by saddhamp on 8/3/16.
 */
public class FullNameHandler extends Handler{
    @Override
    public void handle(Request request) {
        StringBuilder sb = new StringBuilder();
        sb.append(request.getFirstName());
        sb.append(" ");
        sb.append(request.getLastName());
        request.setFullName(sb.toString());

        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
