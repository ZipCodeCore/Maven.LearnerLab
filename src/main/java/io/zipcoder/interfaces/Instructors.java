package io.zipcoder.interfaces;

public class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    Instructors() {

    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
