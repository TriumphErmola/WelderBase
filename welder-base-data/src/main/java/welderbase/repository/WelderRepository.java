package welderbase.repository;


import org.springframework.data.repository.CrudRepository;
import welderbase.model.Welder;

public interface WelderRepository extends CrudRepository<Welder,Long> {
}
