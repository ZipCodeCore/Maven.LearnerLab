package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students {
    private static final List<Student> INSTANCE = new ArrayList<>();

    private Students(Student student){
        // private constructor to avoid client applications to use constructor
        INSTANCE.add(student);
    }

    public static List<Student> getInstance(){
        return INSTANCE;
    }
}
