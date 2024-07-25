package com.hr.personnel;

public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee(String s, String d, double m){
        super(s, d);
        this.monthlySalary = m;
    }
    public double getMonthlySalary(){
        return this.monthlySalary;
    }
    public void setMonthlySalary(double d) {
        this.monthlySalary = d;
    }
}
