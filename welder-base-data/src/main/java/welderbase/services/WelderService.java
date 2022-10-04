package welderbase.services;

import welderbase.model.Welder;

import java.util.Set;

public interface WelderService {

    Welder findByLastName(String lastName);

    Welder findById(Long id);

    Welder save(Welder welder);

    Set<Welder> findAll();

}
