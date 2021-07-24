package io.zipcoder.interfaces;

public final class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors (){
        this.add(new Instructor(444L, "Dolio"));
        this.add(new Instructor(445L, "Leon"));
        this.add(new Instructor(446L, "Kris"));
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
