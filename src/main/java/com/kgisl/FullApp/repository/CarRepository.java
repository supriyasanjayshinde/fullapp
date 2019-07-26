package com.kgisl.FullApp.repository;

import com.kgisl.FullApp.model.Car;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CarRepository
 */
public interface CarRepository extends JpaRepository<Car,Long>{

    
}
