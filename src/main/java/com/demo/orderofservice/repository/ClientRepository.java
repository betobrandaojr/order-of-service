package com.demo.orderofservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.orderofservice.assets.model.client.Client;

@Repository
public interface ClientRepository  extends JpaRepository< Client, Integer>{ 

    
}
