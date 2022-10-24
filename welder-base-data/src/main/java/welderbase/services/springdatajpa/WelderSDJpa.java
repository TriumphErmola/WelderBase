package welderbase.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import welderbase.model.Welder;
import welderbase.repositories.WelderJointsRepository;
import welderbase.repositories.WelderRepository;
import welderbase.repositories.WorkPlaceRepository;
import welderbase.services.CrudService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class WelderSDJpa implements CrudService<Welder, Long> {

    private final WelderRepository welderRepository;
    private final WelderJointsRepository welderJointsRepository;
    private final WorkPlaceRepository workPlaceRepository;

    public WelderSDJpa(WelderRepository welderRepository,
                       WelderJointsRepository welderJointsRepository,
                       WorkPlaceRepository workPlaceRepository) {

        this.welderRepository = welderRepository;
        this.welderJointsRepository = welderJointsRepository;
        this.workPlaceRepository = workPlaceRepository;
    }

    @Override
    public Set<Welder> findAll() {
        Set<Welder> welders = new HashSet<>();
        welderRepository.findAll().forEach(welders::add);
        return welders;
    }

    @Override
    public Welder findById(Long aLong) {
        return welderRepository.findById(aLong).orElse(null);
    }

    @Override
    public Welder save(Welder object) {
        return welderRepository.save(object);
    }

    @Override
    public void delete(Welder object) {
        welderRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        welderRepository.deleteById(aLong);
    }
}

