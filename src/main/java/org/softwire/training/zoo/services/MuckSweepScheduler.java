package org.softwire.training.zoo.services;

import org.softwire.training.zoo.models.Animal;
import org.softwire.training.zoo.models.CanBeGroomed;
import org.softwire.training.zoo.models.CanHaveMuckSweptOut;
import org.softwire.training.zoo.models.Keeper;

import java.util.List;

public class MuckSweepScheduler implements Scheduler {
    private static MuckSweepScheduler instance;

    private MuckSweepScheduler() {
    }

    public static MuckSweepScheduler getInstance() {
        if (instance == null) {
            instance = new MuckSweepScheduler();
        }
        return instance;
    }

    public void assignJobs(List<Keeper<? extends Animal>> keepers) {
        keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(animal -> {
            if (animal instanceof CanHaveMuckSweptOut) {
                keeper.sweepMuck((CanHaveMuckSweptOut) animal);
            }
        }));
    }
}
