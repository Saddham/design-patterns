package com.design.patterns.behavioral.command;

/**
 * Created by saddhamp on 14/3/16.
 */
public interface Command {
    public void execute(Request request, Response response);
}
