package org.tp.haustierklinikdata.services;

import org.tp.haustierklinikdata.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
