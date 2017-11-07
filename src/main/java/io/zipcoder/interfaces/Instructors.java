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
        ArrayList<Instructor> instructors=super.getPersonList();
        Instructor [] instructorsArray=instructors.toArray(new Instructor[instructors.size()]);
        return  instructorsArray;
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

}
