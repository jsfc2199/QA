package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Station;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class StationController {
    @Autowired
    private StationService service;

    @PostMapping("create/station")
    public Station createUser(@RequestBody Station station) throws Exception {
        return service.createStation(station);
    }
}
