package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class  Instructors extends People<Instructor> {

    private static final Instructors INSTANCE=new Instructors();


    private Instructors(){
        for(int i=0; i<2; i++){
            super.add(new Instructor(i, Educator.values()[i]));
        }
    }

    public Instructor[] getArray() {

        return personList.toArray(new Instructor[personList.size()]);

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

}
