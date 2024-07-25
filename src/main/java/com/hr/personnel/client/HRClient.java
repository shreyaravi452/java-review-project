package com.hr.personnel.client;

import com.hr.personnel.Employee;

public class HRClient {
    public static void main(String[] args){
        Employee emp1 = new Employee("Shreya", "2016-07-15");
        Employee emp2 = new Employee("Priyanka", "2018-07-08");
        System.out.println(emp1.getEmployeeInfo());
        System.out.println(emp2.getEmployeeInfo());
        System.out.println(emp1.computeNumberOfYearsWorkedSinceHired());
        System.out.println(emp2.computeNumberOfYearsWorkedSinceHired());
    }
}
