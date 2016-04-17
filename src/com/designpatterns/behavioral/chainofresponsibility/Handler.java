package com.design.patterns.behavioral.chainofresponsibility;

/**
 * Created by saddhamp on 8/3/16.
 */
public abstract class Handler {
    protected Handler nextHandler;

    public void add(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void wrap(Handler headHandler){
        if(nextHandler == null){
            nextHandler = headHandler;
        } else{
            nextHandler.wrap(headHandler);
        }
    }

    public abstract void handle(Request request);
}
