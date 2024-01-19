package com.example.demo.repository;

import com.example.demo.entity.Station;
import com.example.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}
