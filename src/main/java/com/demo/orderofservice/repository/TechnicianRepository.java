package com.demo.orderofservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.orderofservice.assets.model.technician.Technician;

@Repository
public interface TechnicianRepository  extends JpaRepository<Technician, Integer>{
    

    
}
