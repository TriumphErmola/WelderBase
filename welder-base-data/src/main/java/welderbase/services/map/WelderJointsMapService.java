package welderbase.services.map;

import org.springframework.stereotype.Service;
import welderbase.model.WelderJoints;
import welderbase.services.CrudService;

import java.util.Set;

@Service
public class WelderJointsMapService extends AbstractMapService<WelderJoints, Long> implements CrudService<WelderJoints, Long> {
    @Override
    public Set<WelderJoints> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(WelderJoints object) {
        super.delete(object);
    }

    @Override
    public WelderJoints save(WelderJoints object) {
        return super.save(object.getId(), object);
    }

    @Override
    public WelderJoints findById(Long id) {
        return super.findById(id);
    }
}
