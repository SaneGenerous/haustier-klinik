package org.tp.haustierklinik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.tp.haustierklinik.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
