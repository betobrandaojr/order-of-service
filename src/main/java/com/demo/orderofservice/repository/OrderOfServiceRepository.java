package com.demo.orderofservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.orderofservice.assets.OS.OrderOfService;

public interface OrderOfServiceRepository  extends JpaRepository<OrderOfService, Integer>{

}
