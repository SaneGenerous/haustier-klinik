package org.tp.haustierklinik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.tp.haustierklinik.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
