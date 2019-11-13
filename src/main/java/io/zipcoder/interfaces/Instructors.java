package io.zipcoder.interfaces;

public final class Instructors extends People{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){

        Instructor instructorOne = new Instructor(311412L, "Dolio");
        Instructor instructorTwo = new Instructor(24302L, "Roberto");

        personList.add(instructorOne);
        personList.add(instructorTwo);

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
