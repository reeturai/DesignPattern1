/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern1;

import com.leapfrog.DesignPattern1.controller.DepartmentController;
import com.leapfrog.DesignPattern1.controller.EmployeeController;
import java.util.Scanner;


public class MainMenu {
    
    public void mainMenu(){
    Scanner input=new Scanner(System.in);
     DepartmentController dc=new DepartmentController(new Scanner(System.in),new MainMenu());
       EmployeeController ec=new EmployeeController(new Scanner(System.in));
     System.out.println("enter your choice");
        System.out.println("1.Department");
        System.out.println("2.Employee");
        System.out.println("3.Exit");
        switch(input.nextInt()){
            case 1:
           dc.process();
            case 2:
           ec.process();
            case 3:
            System.exit(0);
    }}}
