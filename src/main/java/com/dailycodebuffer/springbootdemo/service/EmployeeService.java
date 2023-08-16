package com.dailycodebuffer.springbootdemo.service;
import java.util.*;
import com.dailycodebuffer.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    public Employee save(Employee emp);
    public List<Employee> getAllRecords();
    public Employee getEmployeeId(String id);
}
