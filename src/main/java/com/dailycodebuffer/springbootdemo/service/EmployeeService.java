package com.dailycodebuffer.springbootdemo.service;

import com.dailycodebuffer.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    public Employee save(Employee emp);
}
