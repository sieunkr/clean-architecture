package clean.architecture.application.core.usecase;

import clean.architecture.application.core.entity.Diary;

public interface Diarial {
    void writeDiary(Diary diary);
    Diary findDiary();
}
