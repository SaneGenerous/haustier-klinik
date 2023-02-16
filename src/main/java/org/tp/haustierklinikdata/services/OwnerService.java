package org.tp.haustierklinikdata.services;

import org.tp.haustierklinikdata.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
