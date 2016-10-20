/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern1.impl;

import com.leapfrog.DesignPattern1.dao.DepartmentDAO;
import com.leapfrog.DesignPattern1.entity.Department;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author welcome
 */
public class DepartmentDAOimpl implements DepartmentDAO {

    List<Department> list = new ArrayList<>();

    @Override
    public void insert(Department d) {
        list.add(d);
    }

    @Override
    public boolean delete(int id) {
        for (Department d : list) {
            if (d.getId() == id) {
                System.out.println("deleted successfully");
                return list.remove(d);
                }  }
        System.out.println("id not found");
       return false;
        
    }

    @Override
    public Department getbyid(int id) {
        for (Department d : list) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }

    @Override
    public List<Department> getall() {
        return list;
    }

}
