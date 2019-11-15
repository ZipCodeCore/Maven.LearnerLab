package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Instructors extends People<Instructor> {

    private static final List<Instructor> INSTANCE = new ArrayList<>();

    private Instructors (Instructor instructor){
        // private constructor
        INSTANCE.add(instructor);
    }

    public static List<Instructor> getInstance(){
        return INSTANCE;
    }


    public Instructor[] toArray() {
        Instructor[] instructorsArray = new Instructor[this.INSTANCE.size()];
        int i = 0;
        for (Instructor eachInstructor : this.INSTANCE){
            instructorsArray[i++] = eachInstructor;
        }
        return instructorsArray;
    }
}
