package org.softwire.training.zoo.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface CanBeGroomed {
    void groom();

    void setLastGroomed(LocalDateTime time);

    static void defaultGroom(CanBeGroomed animal) {
        animal.setLastGroomed(LocalDateTime.now());
    }
}
