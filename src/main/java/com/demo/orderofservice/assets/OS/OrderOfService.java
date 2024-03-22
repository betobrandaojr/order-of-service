package com.demo.orderofservice.assets.OS;

import java.time.LocalDateTime;

import com.demo.orderofservice.assets.enums.Priority;
import com.demo.orderofservice.assets.enums.Status;
import com.demo.orderofservice.assets.model.client.Client;
import com.demo.orderofservice.assets.model.technician.Technician;



public class OrderOfService {

    private Integer id;
    private LocalDateTime openDate;
    private LocalDateTime closeDate;
    private Integer priority;
    private String Observation;
    private Integer status;
    private Technician technician;
    private Client client;

    public OrderOfService() {
        super();
    }

    public OrderOfService(Integer id, LocalDateTime openDate, LocalDateTime closeDate, Priority priority,
            String observation,
            Status status, Technician technician, Client client) {
        super();
        this.id = id;
        this.openDate = openDate;
        this.closeDate = closeDate;
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
