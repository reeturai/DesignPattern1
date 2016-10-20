/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern1.dao;


import com.leapfrog.DesignPattern1.entity.Department;
import java.util.List;

/**
 *
 * @author welcome
 */
public interface DepartmentDAO {
     void insert(Department e);
    boolean delete(int id);
    Department getbyid(int id);
    List<Department> getall();
}
