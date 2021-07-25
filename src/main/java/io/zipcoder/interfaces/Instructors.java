package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        add(new Instructor(111L,"Leon"));
        add(new Instructor(112L,"Dolio"));
        add(new Instructor(113L,"Kris"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }


    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);
    }
}
