package welderbase.repositories;


import org.springframework.data.repository.CrudRepository;
import welderbase.model.Welder;

public interface WelderRepository extends CrudRepository<Welder,Long> {
}
