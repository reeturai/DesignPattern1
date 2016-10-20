/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern1.dao;

import com.leapfrog.DesignPattern1.entity.Employee;
import java.util.List;

/**
 *
 * @author welcome
 */
public interface EmployeeDAO {
    void insert(Employee e);
    boolean delete(int id);
    Employee getbyid(int id);
    List<Employee> getall();
}
