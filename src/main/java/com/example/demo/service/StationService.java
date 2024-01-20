package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Station;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class StationService {

    @Autowired
    private StationRepository stationRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public Station createStation(Station station){

        Employee employee = employeeRepository.findById(station.getEmployeeId()).get();
        if (!employee.getRole().equals("Logistica")) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Empleado no es de tipo Logistica");
        }
        employee.setStation(station);

        stationRepository.save(station);
        employeeRepository.save(employee);
        return station;
    }

    public boolean isEnabled(Station station){
        return station.getYNOpen().equals("S");
    }

    public boolean changeState(Long employeeId, Long stationId){
        Employee employee = employeeRepository.findById(employeeId).get();
        Station station = stationRepository.findById(stationId).get();

        if (!employee.getRole().equals("Administrador")) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Empleado no es de tipo Administrador");
        }
        station.setYNOpen( station.getYNOpen().equals("S")  ? "N" : "S" );

        stationRepository.save(station);
        return true;
    }
}
