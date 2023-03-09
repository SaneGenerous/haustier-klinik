package org.tp.haustierklinik.services.map;

import org.springframework.stereotype.Service;
import org.tp.haustierklinik.model.Speciality;
import org.tp.haustierklinik.services.SpecialitiesService;

import java.util.Set;
@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality findById(Long id) {
        super.findById(id);
        return null;
    }
}
