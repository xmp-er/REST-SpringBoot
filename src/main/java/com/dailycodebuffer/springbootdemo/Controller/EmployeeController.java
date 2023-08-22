package com.dailycodebuffer.springbootdemo.Controller;

import com.dailycodebuffer.springbootdemo.model.Employee;
import com.dailycodebuffer.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeController {
    @Qualifier("employeeServiceImpl")
    @Autowired
    private EmployeeService empService;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee emp){
        return empService.save(emp);
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
