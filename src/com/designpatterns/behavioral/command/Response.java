package com.design.patterns.behavioral.command;

/**
 * Created by saddhamp on 14/3/16.
 */
public class Response {
    private String upperCaseName;
    private Status status;

    public String getUpperCaseName() {
        return upperCaseName;
    }

    public void setUpperCaseName(String upperCaseName) {
        this.upperCaseName = upperCaseName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean hasErrors(){
        return (status.getStatusCode()!=null && status.getStatusCode().startsWith("ERR"))?true:false;
    }
}



