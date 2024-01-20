package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Station;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationService {

    @Autowired
    private StationRepository stationRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public Station createStation(Station station){
        Employee employee = employeeRepository.findById(station.getEmployeeId()).get();
        employee.setStation(station);

        stationRepository.save(station);
        employeeRepository.save(employee);
        return station;
    }
}
