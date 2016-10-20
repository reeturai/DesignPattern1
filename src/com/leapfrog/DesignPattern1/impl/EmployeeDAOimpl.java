/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern1.impl;

import com.leapfrog.DesignPattern1.dao.EmployeeDAO;
import com.leapfrog.DesignPattern1.entity.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author welcome
 */
public class EmployeeDAOimpl implements EmployeeDAO {

    List<Employee> list = new ArrayList<>();

    @Override
    public void insert(Employee e) {
        list.add(e);
    }

    @Override
    public boolean delete(int id) {
        for (Employee e : list) {
            if (e.getId() == id) {
                System.out.println("deleted successfully");
                return list.remove(e);
            }

        }
        System.out.println("id not found");
        return false;
    }

    @Override
    public Employee getbyid(int id) {
        for (Employee e : list) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getall() {
        return list;
    }

}
