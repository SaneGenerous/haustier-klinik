package org.tp.haustierklinik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.tp.haustierklinik.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
