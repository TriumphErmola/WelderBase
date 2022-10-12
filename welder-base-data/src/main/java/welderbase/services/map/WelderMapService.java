package welderbase.services.map;

import welderbase.model.Welder;
import welderbase.services.CrudService;

import java.util.Set;

public class WelderMapService extends AbstractMapService<Welder, Long> implements CrudService<Welder, Long> {

    @Override
    public Set<Welder> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Welder object) {
        super.delete(object);
    }

    @Override
    public Welder save(Welder object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Welder findById(Long id) {
        return super.findById(id);
    }
}
