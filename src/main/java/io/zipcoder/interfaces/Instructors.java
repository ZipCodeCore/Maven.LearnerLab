package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    static final Instructors INSTANCE;

    private Instructors() {
    }

    static {
        INSTANCE = new Instructors();
    }

    public static Instructors getInstance() {
        return Instructors.INSTANCE;
    }
}
