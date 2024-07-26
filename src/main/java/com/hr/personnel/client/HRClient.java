package com.hr.personnel.client;

import com.hr.corp.Corporation;
import com.hr.personnel.*;
import gov.irs.IRS;
import gov.irs.TaxPayer;

import java.util.ArrayList;

public class HRClient {
    public static void main(String[] args){
        Employee emp1 = new SalariedEmployee("Shreya", "2016-07-15", 10000);
        Employee emp2 = new SalariedEmployee("Steve", "2018-07-08", 8500);
        Employee emp3 = new HourlyEmployee("Sonal", "2015-08-12", 60, 275);
        System.out.println(emp1.getEmployeeInfo());
        System.out.println(emp2.getEmployeeInfo());
        System.out.println(emp1.computeNumberOfYearsWorkedSinceHired());
        System.out.println(emp2.computeNumberOfYearsWorkedSinceHired());
        System.out.println("testing abstraction for salaried employee: "+emp2.getEmployeeInfo());
        System.out.println("testing abstraction for hourly employee: "+emp3.getEmployeeInfo());
        Department dept = new Department("WMT", "Bangalore");
        dept.addEmployee(emp1);
        dept.addEmployee(emp2);
        dept.addEmployee(emp3);
        System.out.println("No of emps worked: " + dept.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked());

        System.out.println("emp1 monthly compensation: "+emp1.computeMonthlyCompensation());
        System.out.println("emp2 monthly compensation: "+emp2.computeMonthlyCompensation());
        System.out.println("emp3 monthly compensation: "+emp3.computeMonthlyCompensation());

        System.out.println("Department Total Monthly Compensation: "+dept.computeDepartmentMonthlyTotalCompensation());

        ArrayList<Double> c1 = new ArrayList<>(12);
        ArrayList<Double> c2 = new ArrayList<>(5);
        for(int i=0;i<12;i++){
            c1.add(100.50);
        }
        for (int i = 0; i < 5; i++) {
            c2.add(200.30);
        }
        Employee cemp1 = new CommissionedEmployee("Detelina","2014-09-24", 0.22, c1);
        Employee cemp2 = new CommissionedEmployee("Santosh", "2014-12-12", 0.34, c2);
        System.out.println("cemp1 monthly compensation: "+cemp1.computeMonthlyCompensation());
        System.out.println("cemp2 monthly compensation: "+cemp2.computeMonthlyCompensation());

        TaxPayer corp = new Corporation("LIC", 25000);
        TaxPayer sal = new SalariedEmployee("Amy", "2019-11-11", 13000);
        TaxPayer hour = new HourlyEmployee("Jack", "2020-10-10", 65, 320);
        IRS govIrs = new IRS();
        govIrs.register(sal);
        govIrs.register(hour);
        govIrs.register(corp);
        System.out.println("Total monthly tax to collect by IRS: "+govIrs.computeTotalMonthlyTaxToCollect());
    }
}
