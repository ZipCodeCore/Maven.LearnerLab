package io.zipcoder.interfaces;

public final class Instructors extends People{
    private static final Instructors instance = new Instructors();

    private Instructors(){
        super();
    }

    public static Instructors getInstance() {
        return instance;
    }
}
