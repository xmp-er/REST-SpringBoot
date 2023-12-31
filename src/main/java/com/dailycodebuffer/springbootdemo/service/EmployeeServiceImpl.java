package com.dailycodebuffer.springbootdemo.service;

import com.dailycodebuffer.springbootdemo.errors.EmployeeNotFoundException;
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

    public List<Employee> getAllRecords(){
        return employees;
    }

    public Employee getEmployeeId(String id){
        for (var i : employees) {
            if (i.getEmployeeId().equals(id)) {
                return i;
            }
        }
        throw new RuntimeException("Employee with the id " + id + " was not found");
    }

    public String deleteEmployeeById(String id){
        Employee e = getEmployeeId(id);
        employees.remove(e);
        return "Employee Deleted Succesfully";
    }
}
