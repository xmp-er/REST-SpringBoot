package com.dailycodebuffer.springbootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_name")
public class EmployeeEntity {
    @Id
    private String employeeId;
    private String name;
    private String employeeMail;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeMail() {
        return employeeMail;
    }

    public void setEmployeeMail(String employeeMail) {
        this.employeeMail = employeeMail;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", employeeMail='" + employeeMail + '\'' +
                '}';
    }
}
