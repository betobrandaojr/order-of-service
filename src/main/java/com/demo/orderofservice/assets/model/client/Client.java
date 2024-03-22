package com.demo.orderofservice.assets.model.client;

import com.demo.orderofservice.assets.model.people.People;

public class Client extends People {

    public Client() {
        super();
    }

    public Client(Integer id, String name, String cpf, String telephone) {
        super(id, name, cpf, telephone);
    }

}
