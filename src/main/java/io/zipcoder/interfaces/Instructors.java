package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    public static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        this.add(new Instructor (101L, "Dolio"));
        this.add(new Instructor (102L, "Leon"));
        this.add(new Instructor (103L, "Kris"));

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor[] toArray(){
         return elementList.toArray(new Instructor[0]);
        }


}
