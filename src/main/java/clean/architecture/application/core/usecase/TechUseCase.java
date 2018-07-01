package clean.architecture.application.core.usecase;

import clean.architecture.application.core.entity.Stack;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TechUseCase {

    private final Technical technical;


    public TechUseCase(Technical technical) {
        this.technical = technical;
    }

    public Collection<Stack> listTeckStack(){
        return technical.listTechStack();
    }


}
