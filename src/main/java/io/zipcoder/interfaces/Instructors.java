package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        ArrayList<String> instructors = new ArrayList<>();
        instructors.add("Tariq Hook");
        instructors.add("Dolio Durant");
        instructors.add("Leon Hunter");

        for(int i = 0; i < instructors.size(); i++) {
            super.add(new Instructor(i, instructors.get(i)));
        }
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
