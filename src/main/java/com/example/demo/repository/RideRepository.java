package com.example.demo.repository;

import com.example.demo.entity.Ride;
import com.example.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Long> {
}
