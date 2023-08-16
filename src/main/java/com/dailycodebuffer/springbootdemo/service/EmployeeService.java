package com.dailycodebuffer.springbootdemo.service;
import java.util.*;

import com.dailycodebuffer.springbootdemo.errors.EmployeeNotFoundException;
import com.dailycodebuffer.springbootdemo.model.Employee;


public interface EmployeeService {
    public Employee save(Employee emp);
    public List<Employee> getAllRecords();
    public Employee getEmployeeId(String id);
}
