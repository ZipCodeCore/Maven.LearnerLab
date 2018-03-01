package io.zipcoder.interfaces;

public class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }

    private Instructors() {
    }

    public Person[] getArray() {
        return new Person[0];
    }
}
