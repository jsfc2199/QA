package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Ride;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class RideController {
    @Autowired
    private RideService service;

    @PostMapping("create/ride")
    public Ride createUser(@RequestBody Ride ride) throws Exception {
        return service.createRide(ride);
    }
}
