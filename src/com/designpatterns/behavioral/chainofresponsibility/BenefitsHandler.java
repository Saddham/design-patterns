package com.design.patterns.behavioral.chainofresponsibility;

import java.util.List;

import static com.design.patterns.behavioral.chainofresponsibility.Designation.*;

/**
 * Created by saddhamp on 8/3/16.
 */
public class BenefitsHandler extends Handler {
    @Override
    public void handle(Request request) {
        Designation designation = request.getDesignation();
        List<String> benefits = request.getBenefits();

        benefits.add("Paid time off");
        benefits.add("PF");
        benefits.add("Gratuity");
        benefits.add("Medical Insurance");

        switch (designation){
            case DEVELOPMENT_ENGINEER:
                benefits.add("Performance Bonus");
                break;
            case SENIOR_DEVELOPMENT_ENGINEER:
                benefits.add("Referral Bonus");
                break;
            case PRINCIPAL_DEVELOPMENT_ENGINEER:
                benefits.add("Work from home");
                break;
            case ARCHITECT:
                benefits.add("Stocks");
        }

        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
