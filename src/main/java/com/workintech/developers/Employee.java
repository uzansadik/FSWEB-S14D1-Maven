package com.workintech.developers;

public class Employee {
    private long id;
    private String name;
    private double salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(long id, String name, double salary) {
        setId(id);
        setName(name);
        setSalary(salary);
    }

    public void work(){
        System.out.println("Employee starts to working");
    }
}
