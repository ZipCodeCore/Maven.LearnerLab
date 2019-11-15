package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors (){
        // private constructor
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }




    public Instructor[] toArray() {
        Instructor[] instructorsArray = new Instructor[this.INSTANCE.count()];
        int i = 0;
        for (Instructor eachInstructor : this.INSTANCE){
            instructorsArray[i++] = eachInstructor;
        }
        return instructorsArray;
    }
}
