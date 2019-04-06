package com.springframework.petclinicdata.services;

import com.springframework.petclinicdata.model.Vet;

import java.util.Set;

public interface VetService {

        Vet findById(Long id);
        Vet save(Vet vet);
        Set<Vet> finaAll();
}
