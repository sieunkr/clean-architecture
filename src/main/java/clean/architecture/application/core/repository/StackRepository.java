package clean.architecture.application.core.repository;

import clean.architecture.application.core.entity.Stack;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface StackRepository extends CrudRepository<Stack, Long> {

    Collection<Stack> findAll();

}
