package com.dailycodebuffer.springbootdemo.service;

import com.dailycodebuffer.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    List<Employee> employees = new ArrayList<>();
    @Override
    public Employee save(Employee emp) {
        if(emp.getEmployeeId()==null || emp.getEmployeeMail().isEmpty()){
            emp.setEmployeeId(UUID.randomUUID().toString());
        }
        System.out.println("The details are "+emp.toString());
        employees.add(emp);
        return emp;
    }
}
