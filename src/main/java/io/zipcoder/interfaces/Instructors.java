package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Instructors extends People {

    static final Instructors INSTANCE = new Instructors();

    public Instructors() {

        ArrayList<String> instructors = new ArrayList<String>();
        instructors.add(0,"Leon");
        instructors.add(1,"Tariq");
        instructors.add(2,"Dolio");

        for(int i = 0; i < instructors.size(); i++){

            super.add(new Instructor(i, instructors.get(i)));
        }
    }

    public static Instructors getInstance() {

        return INSTANCE;
    }

}
