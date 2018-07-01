package clean.architecture.application.entrypoints.rest;

import clean.architecture.application.core.entity.Stack;
import clean.architecture.application.core.usecase.TechUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/stacks")
public class TechStackController {

    private final TechUseCase techUseCase;

    public TechStackController(TechUseCase techUseCase) {
        this.techUseCase = techUseCase;
    }

    @GetMapping
    public Collection<Stack> findAll(){
        return techUseCase.listTeckStack();
    }
}
