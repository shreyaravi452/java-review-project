package com.hr.personnel;

import java.util.ArrayList;

public class CommissionedEmployee extends Employee{
    private double commissionRate;
    private ArrayList<Double> monthlySales;

    public CommissionedEmployee(String s, String d, double cr, ArrayList<Double> ms){
        super(s, d);
        this.commissionRate = cr;
        this.monthlySales = ms;
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public ArrayList<Double> getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(ArrayList<Double> monthlySales) {
        this.monthlySales = monthlySales;
    }

    @Override
    public String getEmployeeInfo() {
        return "";
    }

    @Override
    public double computeMonthlyCompensation() {
        double total=0.0;
        for(int i=0;i<this.monthlySales.size();i++){
            total+=this.commissionRate*this.monthlySales.get(i);
        }
        return total;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return 0;
    }
}
