package com.hr.personnel;

public class HourlyEmployee extends Employee{
    private int hoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String s, String d, int h, double r){
        super(s, d);
        this.hoursWorkedPerMonth = h;
        this.hourlyRate = r;
    }
    public int getHoursWorkedPerMonth(){
        return this.hoursWorkedPerMonth;
    }
    public void setHoursWorkedPerMonth(int i){
        this.hoursWorkedPerMonth = i;
    }
    public double getHourlyRate(){
        return this.hourlyRate;
    }
    public void setHourlyRate(double d){
        this.hourlyRate = d;
    }

    @Override
    public String getEmployeeInfo() {
        return ""+this.hourlyRate+" "+this.hoursWorkedPerMonth+" "+super.getName()+" "+super.getHireDate();
    }

    @Override
    public double computeMonthlyCompensation() {
        return this.hourlyRate*this.hoursWorkedPerMonth;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return computeMonthlyCompensation()*HOURLY_TAX_RATE;
    }
}
