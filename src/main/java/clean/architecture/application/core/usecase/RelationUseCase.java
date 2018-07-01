package clean.architecture.application.core.usecase;

import clean.architecture.application.core.entity.Programmer;
import org.springframework.stereotype.Service;

@Service
public class RelationUseCase {

    private final Relational relational;

    public RelationUseCase(Relational relational) {
        this.relational = relational;
    }

    public void follow(){
        relational.follow();
    }

    public Programmer findByName(String name){
        return relational.findByName(name);
    }

}
