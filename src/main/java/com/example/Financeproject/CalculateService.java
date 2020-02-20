package com.example.Financeproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    @Autowired
    private UserFinancials userFinancials;

    public void calculateRisk() {

        //If the users net worth is more than 25 times his or hers yearly expense then it is considered to be economically independent
        if (userFinancials.netWorth / (userFinancials.monthlySavings * 12) >= 25) {
            userFinancials.setEconomicallyIndependent(true);
        }
    }
}
