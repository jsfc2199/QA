package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.RideRepository;
import com.example.demo.repository.StationRepository;
import com.example.demo.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class RideService {
    @Autowired
    private RideRepository rideRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UsuariosRepository usuariosRepository;

    public Ride createRide(Ride ride) {
        Employee employee = employeeRepository.findById(ride.getEmployeeId()).get();

        if (!employee.getRole().equals("Operador")) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Empleado no es de tipo operador");
        }

        employee.setRide(ride);

        rideRepository.save(ride);
        employeeRepository.save(employee);
        return ride;
    }

    public boolean allowEntry(Long ticketId, Long rideId) {
        Usuario usuario = usuariosRepository.findById(ticketId).get();
        Ride ride = rideRepository.findById(rideId).get();

        return ride.getYnopen().equals("S") && ride.getMinHeight() < usuario.getHeight();
    }


}
