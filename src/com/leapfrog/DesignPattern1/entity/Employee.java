/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern1.entity;

/**
 *
 * @author welcome
 */
public class Employee {
    private int id,salary,bonus;
    private String Name;

    public Employee() {
    }

    public Employee(int id, String Name, int salary, int bonus) {
        this.id = id;
        this.Name = Name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", Name=" + Name + ", salary=" + salary + ", bonus=" + bonus + '}';
    }
    
    
    
}
