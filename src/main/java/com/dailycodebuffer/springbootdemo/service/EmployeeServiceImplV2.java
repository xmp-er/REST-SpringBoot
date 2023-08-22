package com.dailycodebuffer.springbootdemo.service;

import com.dailycodebuffer.springbootdemo.entity.EmployeeEntity;
import com.dailycodebuffer.springbootdemo.model.Employee;
import com.dailycodebuffer.springbootdemo.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImplV2 implements EmployeeService{
    @Autowired
    private EmployeeRepository empRepo;
    @Override
    public Employee save(Employee emp) {
        if(emp.getEmployeeId()==null || emp.getEmployeeMail().isEmpty()){
            emp.setEmployeeId(UUID.randomUUID().toString());
        }
        EmployeeEntity e = new EmployeeEntity();
        BeanUtils.copyProperties(emp,e);
        System.out.println(emp);
        System.out.println(e.toString());
        empRepo.save(e);
        return emp;
    }

    @Override
    public List<Employee> getAllRecords() {
        List<EmployeeEntity> empEntityList= empRepo.findAll();
        List<Employee> e = new ArrayList<>();
        for(var i:empEntityList){
            Employee temp = new Employee();
            BeanUtils.copyProperties(i,temp);
            e.add(temp);
        }
        return e;
    }

    @Override
    public Employee getEmployeeId(String id) {
        EmployeeEntity e = empRepo.findById(id).get();
        Employee temp = new Employee();
        BeanUtils.copyProperties(e,temp);
        return temp;
    }

    @Override
    public String deleteEmployeeById(String id) {
        empRepo.deleteById(id);
        return "Entry with the id " + id + " succesfully deleted";
    }
}
