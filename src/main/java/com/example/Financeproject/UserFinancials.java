package com.example.Financeproject;

import org.springframework.stereotype.Component;

@Component
public class UserFinancials {

    int currentSavingsValue;
    int monthlyExpense;
    int monthlySavings;
    int yearsToSave;
    int netWorth;
    boolean economicallyIndependent;

    public int getCurrentSavingsValue() {
        return currentSavingsValue;
    }

    public void setCurrentSavingsValue(int currentSavingsValue) {
        this.currentSavingsValue = currentSavingsValue;
    }

    public int getMonthlyExpense() {
        return monthlyExpense;
    }

    public void setMonthlyExpense(int monthlyExpense) {
        this.monthlyExpense = monthlyExpense;
    }

    public int getMonthlySavings() {
        return monthlySavings;
    }

    public void setMonthlySavings(int monthlySavings) {
        this.monthlySavings = monthlySavings;
    }

    public int getYearsToSave() {
        return yearsToSave;
    }

    public void setYearsToSave(int yearsToSave) {
        this.yearsToSave = yearsToSave;
    }

    public int getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(int netWorth) {
        this.netWorth = netWorth;
    }

    public boolean isEconomicallyIndependent() {
        return economicallyIndependent;
    }

    public void setEconomicallyIndependent(boolean economicallyIndependent) {
        this.economicallyIndependent = economicallyIndependent;
    }
}
