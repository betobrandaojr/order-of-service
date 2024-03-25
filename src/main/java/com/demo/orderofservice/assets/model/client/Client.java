package com.demo.orderofservice.assets.model.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.demo.orderofservice.assets.OS.OrderOfService;
import com.demo.orderofservice.assets.model.people.People;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Client extends People  implements Serializable{
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "client")
    private List<OrderOfService> list = new ArrayList<>();

    public Client() {
        super();
    }

    public Client(Integer id, String name, String cpf, String telephone) {
        super(id, name, cpf, telephone);
    }

    public List<OrderOfService> getList() {
        return list;
    }

    public void setList(List<OrderOfService> orderOfServices) {
        this.list = orderOfServices;
    }

}
