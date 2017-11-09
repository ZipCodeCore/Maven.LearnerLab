package io.zipcoder.interfaces;

public final class Instructors extends People {

    static final Instructors INSTANCE = new Instructors();

    private Instructors() {

        add(new Person(123, "Leon"));
        add(new Person(456, "Dolio"));
        add(new Person(789, "Tyriq"));
    }

    public static Instructors getInstance() {

        return INSTANCE;
    }


}
