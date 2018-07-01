package clean.architecture.application.core.usecase;

import clean.architecture.application.core.entity.Programmer;

public interface Relational {
    void follow();
    Programmer findByName(String name);
}
