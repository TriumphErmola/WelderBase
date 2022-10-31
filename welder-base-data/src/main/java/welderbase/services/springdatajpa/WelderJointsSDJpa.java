package welderbase.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import welderbase.model.WelderJoints;
import welderbase.repositories.WelderJointsRepository;
import welderbase.repositories.WelderRepository;
import welderbase.repositories.WorkPlaceRepository;
import welderbase.services.CrudService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class WelderJointsSDJpa implements CrudService<WelderJoints, Long> {

    private final WelderRepository welderRepository;
    private final WelderJointsRepository welderJointsRepository;
    private final WorkPlaceRepository workPlaceRepository;

    public WelderJointsSDJpa(WelderRepository welderRepository,
                             WelderJointsRepository welderJointsRepository,
                             WorkPlaceRepository workPlaceRepository) {
        this.welderRepository = welderRepository;
        this.welderJointsRepository = welderJointsRepository;
        this.workPlaceRepository = workPlaceRepository;
    }

    @Override
    public Set<WelderJoints> findAll() {
        Set<WelderJoints> welderJoints = new HashSet<>();
        welderJointsRepository.findAll().forEach(welderJoints::add);
        return welderJoints;
    }

    @Override
    public WelderJoints findById(Long aLong) {
        return welderJointsRepository.findById(aLong).orElse(null);
    }

    @Override
    public WelderJoints save(WelderJoints object) {
        return welderJointsRepository.save(object);
    }

    @Override
    public void delete(WelderJoints object) {
        welderJointsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        welderJointsRepository.deleteById(aLong);
    }
}
