package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Instructors {

    private static final List<Instructor> INSTANCE = new ArrayList<>();

    private Instructors (Instructor instructor){
        // private constructor
        INSTANCE.add(instructor);
    }

    public static List<Instructor> getInstance(){
        return INSTANCE;
    }
}
