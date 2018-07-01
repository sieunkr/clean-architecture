package clean.architecture.application.core.repository;

import clean.architecture.application.core.entity.Programmer;
import org.springframework.data.repository.CrudRepository;

public interface ProgrammerRepository extends CrudRepository<Programmer, Long> {

    Programmer findByName(String name);
}
