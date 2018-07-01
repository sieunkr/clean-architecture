package clean.architecture.application.dataproviders.database;

import clean.architecture.application.core.entity.Diary;
import clean.architecture.application.core.usecase.Diarial;
import org.springframework.stereotype.Component;

@Component
public class DiaryDataProviders implements Diarial {

    @Override
    public void writeDiary(Diary diary) {

        //데이터베이스 연동 로직
        System.out.println("일기를 쓰다.");
    }

    @Override
    public Diary findDiary() {
        System.out.println("일기를 찾다.");
        return null;
    }
}
