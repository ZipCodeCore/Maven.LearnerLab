package io.zipcoder.singletons;

import io.zipcoder.Instructor;
import io.zipcoder.People;

public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor tariq = new Instructor("Tariq", 0000L);
        Instructor dolio = new Instructor("Dolio", 0001L);
        Instructor leon = new Instructor("Leon", 0002L);
        Instructor kris = new Instructor("Kris", 0003L);
        Instructor wilhelm = new Instructor("Wilhelm", 0004L);
        Instructor froilan = new Instructor("Froilan", 0005L);
        Instructor nhu = new Instructor("Nhu", 0006L);
        personList.add(tariq);
        personList.add(dolio);
        personList.add(leon);
        personList.add(kris);
        personList.add(wilhelm);
        personList.add(froilan);
        personList.add(nhu);
    }

    @Override
    public Instructor[] getArray() {
        return personList.toArray(new Instructor[0]);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
