package clean.architecture.application.dataproviders.database;

import clean.architecture.application.core.entity.Programmer;
import clean.architecture.application.core.repository.ProgrammerRepository;
import clean.architecture.application.core.usecase.Relational;
import org.springframework.stereotype.Component;

@Component
public class RelationDataProviders implements Relational {

    private final ProgrammerRepository programmerRepository;

    public RelationDataProviders(ProgrammerRepository programmerRepository) {
        this.programmerRepository = programmerRepository;
    }

    @Override
    public void follow() {

    }

    @Override
    public Programmer findByName(String name) {
        return programmerRepository.findByName(name);
    }
}
