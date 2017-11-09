package io.zipcoder.interfaces;

public final class Instructors extends People {

    private static Instructors INSTANCE = new Instructors();


    private Instructors() {

        add(new Person(123, "Tariq"));
        add(new Person(456, "Leon"));
        add(new Person(879, "Sam"));

    }

    public static Instructors getInstance() {

        return INSTANCE;

    }
}