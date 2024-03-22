package com.demo.orderofservice.assets.model.technician;

import com.demo.orderofservice.assets.model.people.People;

public class Technician extends People {

    public Technician() {
        super();
    }

    public Technician(Integer id, String name, String cpf, String telephone) {
        super(id, name, cpf, telephone);
    }

}
