package com.springframework.petclinicdata.services;

import com.springframework.petclinicdata.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> finaAll();
}
