package com.hr.personnel;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hireDate;

    public Employee(String n, String d){
        this.name = n;
        this.hireDate = LocalDate.parse(d);
    }
    public String getEmployeeInfo(){
        return "name = "+this.name+", hireDate = "+this.hireDate;
    }
    public String work(){
        return this.name+"worked";
    }

}
