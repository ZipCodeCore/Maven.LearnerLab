package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Instructors extends People {

    private final static Instructors INSTANCE = new Instructors();

    public static Instructors getINSTANCE(){
        return INSTANCE;
    }

    private Instructors(){
        ArrayList<String> instructors = new ArrayList<String>();
        instructors.add("Tariq Hook");
        instructors.add("Leon Hunter");
        instructors.add("Dolio");

        for(int i = 0; i<instructors.size(); i++){
            super.add(new Instructor(i, instructors.get(i)));
        }
    }
}
