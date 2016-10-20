/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern1.entity;


public class Department {
    private int id;
    private long contactNo;
    private String eMail,location;

    public Department() {
    }

    public Department(int id, long contactNo, String eMail, String location) {
        this.id = id;
        this.contactNo = contactNo;
        this.eMail = eMail;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", eMail=" + eMail + ", location=" + location + ", contactNo=" + contactNo + '}';
    }
    
    
}
