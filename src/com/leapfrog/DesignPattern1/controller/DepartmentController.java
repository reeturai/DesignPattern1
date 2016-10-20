/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern1.controller;

import com.leapfrog.DesignPattern1.MainMenu;
import com.leapfrog.DesignPattern1.dao.DepartmentDAO;
import com.leapfrog.DesignPattern1.entity.Department;
import com.leapfrog.DesignPattern1.impl.DepartmentDAOimpl;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class DepartmentController {

    DepartmentDAO dao = new DepartmentDAOimpl();
    private Scanner input;
    private MainMenu main;

    public DepartmentController(Scanner input,MainMenu main) {
        this.input = input;
        this.main=main;
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
        Department dpt = new Department();
        System.out.println("enter id");
        dpt.setId(input.nextInt());
        System.out.println("enter contact no");
        dpt.setContactNo(input.nextLong());
        System.out.println("enter email");
        dpt.seteMail(input.next());
        System.out.println("enter location");
        dpt.setLocation(input.next());
        dao.insert(dpt);
         System.out.println("Do you want to add more?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
    }}

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
        Department d = dao.getbyid(id);
        if (d != null) {
            System.out.println(d.toString());
        } else {
            System.out.println("id not found");
        } System.out.println("Do you want to search more?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }}
    }

    private void showAll() {
        System.out.println("showing list");
        for (Department de : dao.getall()) {
            System.out.println(de.toString());
        }
    }
    
    private void back(){
        main.mainMenu();
    }
    
    private void exit(){
        System.exit(0);
    }
    
    public void process(){
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
    }
    
    
    
    
}}
