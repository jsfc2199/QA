package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {


        employeeRepository.save(employee);
        return employee;
    }
}
