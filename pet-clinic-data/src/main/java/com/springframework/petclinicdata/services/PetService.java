package com.springframework.petclinicdata.services;

import com.springframework.petclinicdata.model.Pet;

import java.util.Set;

public interface PetService {

        Pet findById(Long id);
        Pet save(Pet pet);
        Set<Pet> finaAll();

}
