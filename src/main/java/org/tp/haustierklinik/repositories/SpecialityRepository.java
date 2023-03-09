package org.tp.haustierklinik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.tp.haustierklinik.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
