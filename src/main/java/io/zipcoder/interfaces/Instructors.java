package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Instructors  extends People <Instructor> {

    private static Instructors INSTANCE = new Instructors();


    private Instructors() {

        ArrayList<String> instructors = new ArrayList<String>();

        instructors.add(0,"Tariq");
        instructors.add(1,"Leon");
        instructors.add(2,"Dolio");

        for(int i = 0; i<instructors.size(); i++) {
            super.add(new Instructor(i, instructors.get(i)));
        }
    }

    public Instructor[] getStudentArray() {
        return new Instructor[0];
    }

    public static Instructors getInstance() {
        if(INSTANCE != null) {
            return INSTANCE;
        }else{
            return INSTANCE;
        }
    }
}