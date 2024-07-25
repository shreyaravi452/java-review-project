package com.hr.personnel;

public class Department {
    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public Department(String n, String l){
        this.name = n;
        this.location = l;
    }
    public void addEmployee(Employee employee){
        this.employees[this.currentIndex] = new Employee();
        this.employees[this.currentIndex] = employee;
        this.currentIndex++;
    }
    public Employee[] getEmployees(){
        return this.employees;
    }
    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(){
        int count=0;
        for(int i=0;i<this.employees.length;i++){
            if(this.employees[i]!=null && this.employees[i].work().equals(this.employees[i].getName()+" worked"))
                count++;
        }
        return count;
    }
}
