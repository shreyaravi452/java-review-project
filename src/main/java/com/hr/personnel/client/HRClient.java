package com.hr.personnel.client;

import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import com.hr.personnel.Department;

public class HRClient {
    public static void main(String[] args){
        Employee emp1 = new SalariedEmployee("Shreya", "2016-07-15", 10000);
        Employee emp2 = new SalariedEmployee("Steve", "2018-07-08", 8500);
        Employee emp3 = new HourlyEmployee("Sonal", "2015-08-12", 5, 85);
        System.out.println(emp1.getEmployeeInfo());
        System.out.println(emp2.getEmployeeInfo());
        System.out.println(emp1.computeNumberOfYearsWorkedSinceHired());
        System.out.println(emp2.computeNumberOfYearsWorkedSinceHired());

        Department dept = new Department("WMT", "Bangalore");
        dept.addEmployee(emp1);
        dept.addEmployee(emp2);
        dept.addEmployee(emp3);
        System.out.println("No of emps worked: " + dept.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked());
    }
}
