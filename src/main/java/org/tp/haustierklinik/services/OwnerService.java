package org.tp.haustierklinik.services;

import org.tp.haustierklinik.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
