package org.tp.haustierklinik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.tp.haustierklinik.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
