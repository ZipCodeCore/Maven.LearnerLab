package io.zipcoder.interfaces;

public class Instructors {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor nhu = new Instructor("Nhu");
        Instructor leon = new Instructor("Leon");
        Instructor kris = new Instructor("Kris");
        Instructor tariq = new Instructor("Tariq");

    }
    public static Instructors getInstance(){
        return INSTANCE;
    }

}
