package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Instructors extends People <Instructor>{

    private final static Instructors INSTANCE = new Instructors();

    public static Instructors getINSTANCE(){
        return INSTANCE;
    }

    private Instructors(){
        ArrayList<String> instructors = new ArrayList<>();
        instructors.add("Tariq");
        instructors.add("Leon");
        instructors.add("Dolio");

        for(int i = 0; i<instructors.size(); i++){
            super.add(new Instructor(i, instructors.get(i)));
        }
    }

    @Override
    public Instructor[] getArray() {
        return personList.toArray(new Instructor[INSTANCE.getCount()]);
    }
}
