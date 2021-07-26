package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor instructor = new Instructor(10l, "Oracle");
        Instructor instructor1 = new Instructor(11l, "Rapper Dolio");
        Instructor instructor2 = new Instructor(12l, "Kris");


        personList.add(instructor);
        personList.add(instructor1);
        personList.add(instructor2);

    }
    public static Instructors getInstance(){
        return INSTANCE;
    }
}
