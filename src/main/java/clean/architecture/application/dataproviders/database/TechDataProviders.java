package clean.architecture.application.dataproviders.database;

import clean.architecture.application.core.entity.Stack;
import clean.architecture.application.core.repository.StackRepository;
import clean.architecture.application.core.usecase.Technical;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class TechDataProviders implements Technical {

    private final StackRepository stackRepository;

    public TechDataProviders(StackRepository stackRepository) {
        this.stackRepository = stackRepository;
    }


    @Override
    public Collection<Stack> listTechStack() {
        return stackRepository.findAll();
    }
}
