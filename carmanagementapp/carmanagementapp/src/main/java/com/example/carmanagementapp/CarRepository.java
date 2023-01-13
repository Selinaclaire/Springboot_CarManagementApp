package com.example.carmanagementapp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


import jakarta.transaction.Transactional;

public interface CarRepository extends JpaRepository<Car, Integer> {
	List<Car> findByCarid(@Param("carid") String carid);
	
	@Transactional
    void deleteByCarid(@Param("carid") String carid);
}