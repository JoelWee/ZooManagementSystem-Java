package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GuineaFowl extends AbstractAnimal implements LargeAnimal, CanBeGroomed, CanHaveMuckSweptOut {

    private LocalDateTime lastGroomed;
    private LocalDateTime lastMuckSweep;

    public GuineaFowl(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void groom() {
        lastGroomed = LocalDateTime.now();
    }

    @Override
    public void sweepMuckOut() {
        lastMuckSweep = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}; Last Muck Sweep {2}", super.toString(), lastGroomed, lastMuckSweep);
    }
}
