package io.zipcoder.interfaces;

public final class Instructors extends People {

    private  static final Instructors INSTANCE = new Instructors();

    private Instructors() {
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

}//singleton classs. a class is turned in to a object 'kind of"
// and put in to a new class
