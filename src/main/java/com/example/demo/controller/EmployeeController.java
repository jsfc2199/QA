package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Usuario;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("create/employee")
    public Employee createEmployee(@RequestBody Employee employee) throws Exception {
        return service.createEmployee(employee);
    }
}
