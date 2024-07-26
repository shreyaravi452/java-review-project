package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public abstract class Employee implements TaxPayer {
    private String name;
    private LocalDate hireDate;

    public Employee(){
    }
    public Employee(String n, String d){
        this.name = n;
        this.hireDate = LocalDate.parse(d);
    }
    public String getName(){
        return this.name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public abstract String getEmployeeInfo();
    public String work(){
        return this.name+" worked";
    }
    public int computeNumberOfYearsWorkedSinceHired() {
        int currYear = LocalDate.now().getYear();
        int year = hireDate.getYear();
        return currYear - year;
    }
    public abstract double computeMonthlyCompensation();
}
