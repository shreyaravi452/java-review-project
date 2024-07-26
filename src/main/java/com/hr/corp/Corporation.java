package com.hr.corp;

import gov.irs.TaxPayer;

public class Corporation implements TaxPayer {
    private String name;
    private double monthlyIncome;

    public Corporation(String n, double i){
        this.name = n;
        this.monthlyIncome = i;
    }
    @Override
    public double computeMonthlyTaxToPay() {
        return this.monthlyIncome*CORP_TAX_RATE;
    }
}
