package com.dailycodebuffer.springbootdemo.Controller;

import com.dailycodebuffer.springbootdemo.model.Employee;
import com.dailycodebuffer.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/employees")
public class EmployeeV2Controller {
    @Qualifier("employeeServiceImplV2")
    @Autowired
    private EmployeeService empService;

    @PostMapping
    public String saveEmployee(@RequestBody Employee emp){
        empService.save(emp);
        return "The details added were "+emp.toString();
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return empService.getAllRecords();
    }

    @GetMapping(value="/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        return empService.getEmployeeId(id);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteEmployeeById(@PathVariable String id){
        return empService.deleteEmployeeById(id);
    }

}
