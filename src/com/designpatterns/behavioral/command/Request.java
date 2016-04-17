package com.design.patterns.behavioral.command;

/**
 * Created by saddhamp on 14/3/16.
 */
public class Request {
    private String flow;
    private String subFlow;
    private String name;

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public String getSubFlow() {
        return subFlow;
    }

    public void setSubFlow(String subFlow) {
        this.subFlow = subFlow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
