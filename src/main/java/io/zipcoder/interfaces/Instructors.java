package io.zipcoder.interfaces;

public final class Instructors extends People {

    protected static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor Tariq = new Instructor(18L, "Tariq");
        Instructor Froilan = new Instructor(19L, "Froilan");
        Instructor Kris = new Instructor(20L, "Kris");
        Instructor Wilhem = new Instructor(21L, "Wilhem");
        Instructor Leon = new Instructor(22L, "Leon");
        Instructor Nhu = new Instructor(23L, "Nhu");
        Instructor Melanie = new Instructor(24L, "Melanie");

        personList.add(Tariq);
        personList.add(Froilan);
        personList.add(Kris);
        personList.add(Wilhem);
        personList.add(Leon);
        personList.add(Nhu);
        personList.add(Melanie);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

}
