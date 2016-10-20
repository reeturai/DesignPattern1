/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern1.controller;

import com.leapfrog.DesignPattern1.MainMenu;
import com.leapfrog.DesignPattern1.dao.EmployeeDAO;
import com.leapfrog.DesignPattern1.entity.Employee;
import com.leapfrog.DesignPattern1.impl.EmployeeDAOimpl;
import java.util.Scanner;

public class EmployeeController {

    EmployeeDAO dao = new EmployeeDAOimpl();
    MainMenu main=new MainMenu();
    private Scanner input;

    public EmployeeController(Scanner input) {
        this.input = input;
    }   
 
    

    private void menu() {
        System.out.println("Enter your choice");
        System.out.println("1.Add information");
        System.out.println("2.Delete id");
        System.out.println("3.Search id");
        System.out.println("4.Show list");
        System.out.println("5.Back to main menu");
        System.out.println("6.Exit");
    }

    private void insert() {
        while(true){
        Employee emp = new Employee();
        System.out.println("enter id");
        emp.setId(input.nextInt());
        System.out.println("enter name");
        emp.setName(input.next());
        System.out.println("enter salary");
        emp.setSalary(input.nextInt());
        System.out.println("enter bonus");
        emp.setBonus(input.nextShort());
        dao.insert(emp);
        System.out.println("Do you want to add more?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }}
       
    }

    private void delete() {
        while(true){
        System.out.println("enter id you want to delete");
        int i = input.nextInt();
        dao.delete(i);
         System.out.println("Do you want to delete more?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
    }}

    private void search() {
        while(true){
        System.out.println("enter id you want to search");
        int id = input.nextInt();
        Employee e = dao.getbyid(id);
        if (e != null) {
            System.out.println(e.toString());
        } else {
            System.out.println("id not found");
        } System.out.println("Do you want to search more?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
    }}

    private void showAll() {
        System.out.println("showing list");
        for (Employee em : dao.getall()) {
            System.out.println(em.toString());
        }
    }

    private void exit() {
        System.exit(0);
    }
    
    private void back(){
        main.mainMenu();
    }

    public void process() {
        while (true) {
            menu();
            switch (input.nextInt()) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    back();
                    break;
                case 6:
                    exit();
            }

        }}}
