package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Ride;
import com.example.demo.entity.Station;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.RideRepository;
import com.example.demo.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideService {
    @Autowired
    private RideRepository rideRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public Ride createRide(Ride ride){
        Employee employee = employeeRepository.findById(ride.getEmployeeId()).get();
        employee.setRide(ride);

        rideRepository.save(ride);
        employeeRepository.save(employee);
        return ride;
    }
}
