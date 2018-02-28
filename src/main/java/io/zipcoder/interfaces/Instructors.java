package io.zipcoder.interfaces;

final class Instructors extends People {

    private final static Instructors INSTANCE = new Instructors();


    private Instructors() {

    }

    public static Instructors getINSTANCE() {

        return INSTANCE;
    }
}
