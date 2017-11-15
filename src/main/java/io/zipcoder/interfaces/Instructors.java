package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Instructors extends People <Instructor> {

    static final Instructors INSTANCE = new Instructors();

    public Instructors() {

        ArrayList<String> Educator = new ArrayList<String>();
        Educator.add(0,"Leon");
        Educator.add(1,"Tariq");
        Educator.add(2,"Dolio");

        for(int i = 0; i < Educator.size(); i++){

            super.add(new Instructor(i, Educator.get(i)));
        }
    }

    public static Instructors getInstance() {

        return INSTANCE;
    }

    public Instructor[] getStudentArray() {
        return new Instructor[0];
    }
}
