package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Station;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class StationController {
    @Autowired
    private StationService service;

    @PostMapping("create/station")
    public Station createStation(@RequestBody Station station) {
        return service.createStation(station);
    }

        @PostMapping("changeState/station")
    public boolean changeState(@RequestParam Long employeeId, @RequestParam Long stationId) {
        return service.changeState(employeeId,stationId);
    }


}
