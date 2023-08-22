package com.dailycodebuffer.springbootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_employee")
public class EmployeeEntity {
    @Id
    private String employeeId;
    private String name;
    private String employeeMail;
}
