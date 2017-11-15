package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class  Instructors extends People<Instructor> {

    private static final Instructors INSTANCE=new Instructors();


    private Instructors(){
        for(int i=0; i<3; i++){
            super.add(new Instructor(i+1, Educator.values()[i].getName()));
        }
    }

    public Instructor[] getArray() {
        Instructor[] instructors=personList.stream().toArray(Instructor[]::new);
        return instructors;

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

}
