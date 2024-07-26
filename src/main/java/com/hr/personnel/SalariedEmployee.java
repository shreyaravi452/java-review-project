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

    @Override
    public String getEmployeeInfo() {
        return ""+this.monthlySalary+" "+super.getName()+" "+super.getHireDate();
    }

    @Override
    public double computeMonthlyCompensation() {
        return this.monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        if(computeMonthlyCompensation()*SALARIED_TAX_RATE > DEFAULT_STANDARD_EMPLOYEE_MONTHLY_DEDUCTION)
            return (computeMonthlyCompensation()*SALARIED_TAX_RATE)-DEFAULT_STANDARD_EMPLOYEE_MONTHLY_DEDUCTION;
        return 0.0;
    }
}
