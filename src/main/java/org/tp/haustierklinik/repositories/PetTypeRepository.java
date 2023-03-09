package org.tp.haustierklinik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.tp.haustierklinik.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
