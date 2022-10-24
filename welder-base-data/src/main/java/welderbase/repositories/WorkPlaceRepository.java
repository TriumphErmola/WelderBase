package welderbase.repositories;

import org.springframework.data.repository.CrudRepository;
import welderbase.model.WorkPlace;

public interface WorkPlaceRepository extends CrudRepository<WorkPlace,Long> {
}
