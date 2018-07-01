package clean.architecture.application.entrypoints.rest;

import clean.architecture.application.core.entity.Diary;
import clean.architecture.application.core.usecase.DiaryUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diary")
public class DiaryController {

    private final DiaryUseCase diaryUseCase;

    public DiaryController(DiaryUseCase diaryUseCase) {
        this.diaryUseCase = diaryUseCase;
    }

    @GetMapping
    public Diary findDiary(){
        return diaryUseCase.findDiary();
    }

}
