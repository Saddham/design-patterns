package com.design.patterns.behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saddhamp on 8/3/16.
 */
public class Request{
    private String firstName;
    private String lastName;
    private String fullName;
    private Designation designation;
    private List<String> benefits;

    public Request(){
        benefits = new ArrayList<String>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public List<String> getBenefits() {
        return benefits;
    }
}
