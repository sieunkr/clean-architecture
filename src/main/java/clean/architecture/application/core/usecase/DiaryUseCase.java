package clean.architecture.application.core.usecase;

import clean.architecture.application.core.entity.Diary;
import org.springframework.stereotype.Service;

@Service
public class DiaryUseCase {

    private final Diarial diarial;

    public DiaryUseCase(Diarial diarial) {
        this.diarial = diarial;
    }

    public void writeDiary(Diary diary){
        diarial.writeDiary(diary);
    }

    public Diary findDiary(){
        return diarial.findDiary();
    }

}
