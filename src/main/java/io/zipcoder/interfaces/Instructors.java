package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class  Instructors extends People<Instructor> {

    private static final Instructors INSTANCE=new Instructors();

    private Instructors(){
        for(int i=21; i<25; i++){
            super.add(new Instructor(i));
        }
    }

    public Instructor[] getArray() {

        return personList.toArray(new Instructor[personList.size()]);

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

}
