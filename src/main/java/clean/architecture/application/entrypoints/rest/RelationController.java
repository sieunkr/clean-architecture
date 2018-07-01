package clean.architecture.application.entrypoints.rest;

import clean.architecture.application.core.entity.Programmer;
import clean.architecture.application.core.usecase.RelationUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relations")
public class RelationController {

    private final RelationUseCase relationUseCase;

    public RelationController(RelationUseCase relationUseCase) {
        this.relationUseCase = relationUseCase;
    }


    @GetMapping
    public void setFollow(){
        relationUseCase.follow();
    }

    @GetMapping("/{name}")
    public Programmer findByName(@PathVariable("name") String name){
        return relationUseCase.findByName(name);
    }

}
