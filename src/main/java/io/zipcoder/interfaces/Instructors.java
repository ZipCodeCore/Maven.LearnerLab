package io.zipcoder.interfaces;

public final class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){

        Instructor newInstructor1 = new Instructor(100L, "Rick");
        Instructor newInstructor2 = new Instructor(110L, "Dana");
        Instructor newInstructor3 = new Instructor(120L, "John");

        personList.add(newInstructor1);
        personList.add(newInstructor2);
        personList.add(newInstructor3);

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}

