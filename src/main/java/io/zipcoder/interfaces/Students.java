package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Students extends People {

    private static final Students INSTANCE = new Students();
    String [] studentsName = {"Raul", "Lola"};

    private Students() {
        for(int i = 0; i < studentsName.length; i++ ){
            Student student = new Student(i, studentsName[i]);
            super.add(student);
        }
    }

    public static Students getInstance() {
        return INSTANCE;
    }


}
