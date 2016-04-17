package com.design.patterns.behavioral.command.worker;

import com.design.patterns.behavioral.command.Command;
import com.design.patterns.behavioral.command.Request;
import com.design.patterns.behavioral.command.Response;

/**
 * Created by saddhamp on 14/3/16.
 */
public class UppercaseWorker implements Command {
    @Override
    public void execute(Request request, Response response) {
        String str = request.getName().toUpperCase();
        response.setUpperCaseName(str);
    }
}
