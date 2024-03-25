package com.demo.orderofservice.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.orderofservice.assets.OS.OrderOfService;
import com.demo.orderofservice.assets.enums.Priority;
import com.demo.orderofservice.assets.enums.Status;
import com.demo.orderofservice.assets.model.client.Client;
import com.demo.orderofservice.assets.model.technician.Technician;
import com.demo.orderofservice.repository.ClientRepository;
import com.demo.orderofservice.repository.OrderOfServiceRepository;
import com.demo.orderofservice.repository.TechnicianRepository;

@Service
public class DBService {

    @Autowired
    private TechnicianRepository technicianRepository;
    private ClientRepository clientRepository;
    private OrderOfServiceRepository orderOfServiceRepository;

    public void instanceDb() {
        Technician t1 = new Technician(null, "João", "626.731.360-37", "(55) 95454-5454");
        Client c1 = new Client(null, "Maria", "181.087.400-96", "(55) 95454-5454");
        OrderOfService os1 = new OrderOfService(null, Priority.HIGH, "Teste", Status.PROGRESS, t1, c1);

        t1.getList().add(os1);
        c1.getList().add(os1);

        technicianRepository.saveAll(Arrays.asList(t1));
        clientRepository.saveAll(Arrays.asList(c1));
        orderOfServiceRepository.saveAll(Arrays.asList(os1));
    }
}
