package com.design.patterns.behavioral.command.worker;

import com.design.patterns.behavioral.command.Command;
import com.design.patterns.behavioral.command.Request;
import com.design.patterns.behavioral.command.Response;
import com.design.patterns.behavioral.command.Status;

/**
 * Created by saddhamp on 14/3/16.
 */
public class RequestValidator implements Command{
    @Override
    public void execute(Request request, Response response) {
        Status status = new Status();
        if(request.getName() == null){
            status.setStatusCode("ERR001");
            status.setStatusMessage("Request name is null");
            response.setStatus(status);
        } else if (request.getName().isEmpty()){
            status.setStatusCode("ERR002");
            status.setStatusMessage("Request name is empty");
            response.setStatus(status);
        }

        System.out.println("Done with request validations!");
    }
}
