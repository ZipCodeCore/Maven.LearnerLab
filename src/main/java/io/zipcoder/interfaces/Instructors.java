package io.zipcoder.interfaces;

public final class Instructors extends People {

    static final Instructors INSTANCE = new Instructors();

    private Instructors() {

        INSTANCE.add(new Person(123, "Leon"));
        INSTANCE.add(new Person(456, "Dolio"));
        INSTANCE.add(new Person(789, "Tyriq"));
    }

    public static Instructors getInstance() {

        return INSTANCE;
    }


}
