package com.demo.orderofservice.assets.OS;

import java.time.LocalDateTime;

import com.demo.orderofservice.assets.enums.Priority;
import com.demo.orderofservice.assets.enums.Status;
import com.demo.orderofservice.assets.model.client.Client;
import com.demo.orderofservice.assets.model.technician.Technician;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class OrderOfService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime openDate;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime closeDate;
    private Integer priority;
    private String Observation;
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Technician technician;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public OrderOfService() {
        super();
        this.setOpenDate(LocalDateTime.now());
        this.setPriority(Priority.LOW);
        this.setStatus(Status.OPEN);
    }

    public OrderOfService(Integer id, Priority priority,
            String observation,
            Status status, Technician technician, Client client) {
        super();
        this.id = id;
        this.setOpenDate(LocalDateTime.now());
        this.priority = (priority == null) ? 0 : priority.getCod();
        Observation = observation;
        this.status = (status == null) ? 0 : status.getCod();
        this.technician = technician;
        this.client = client;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setOpenDate(LocalDateTime openDate) {
        this.openDate = openDate;
    }

    public LocalDateTime getOpenDate() {
        return openDate;
    }

    public void setCloseDate(LocalDateTime closeDate) {
        this.closeDate = closeDate;
    }

    public LocalDateTime getCloseDate() {
        return closeDate;
    }

    public void setPriority(Priority priority) {
        this.priority = priority.getCod();
    }

    public Priority getPriority() {
        return Priority.toEnum(this.priority);
    }

    public void setObservation(String observation) {
        Observation = observation;
    }

    public String getObservation() {
        return Observation;
    }

    public void setStatus(Status status) {
        this.status = status.getCod();
    }

    public Status getStatus() {
        return Status.toEnum(this.status);
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderOfService other = (OrderOfService) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
