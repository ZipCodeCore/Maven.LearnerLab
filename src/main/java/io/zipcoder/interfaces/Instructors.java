package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        add(new Instructor(1, "Leon"));
        add(new Instructor(2, "Dolio"));
        add(new Instructor(3, "Kris"));

    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);
    }
}
