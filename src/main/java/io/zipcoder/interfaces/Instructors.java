package io.zipcoder.interfaces;

import java.util.Arrays;

public final class Instructors extends People<Instructor> {
    private final static Instructors INSTANCE = new Instructors();
    private Instructors(){
        Instructor leon = new Instructor(0,"Leon");
        Instructor dolio = new Instructor(1,"Dolio");
        Instructor kris = new Instructor(2, "Kris");
        Arrays.asList(leon, dolio, kris).forEach(this::add);
    }

    @Override
    public Instructor[] toArray() {
        return INSTANCE.getPersonList().toArray(new Instructor[0]);
    }

    public static Instructors getInstance(){return INSTANCE;}
}
