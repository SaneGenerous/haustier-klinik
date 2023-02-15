package org.tp.haustierklinikdata.services;

import org.tp.haustierklinikdata.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
