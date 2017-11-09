package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private String[] InstructorsName = new String[]{"Tariq", "Leon", " Dolio", "Samantha", "Melanie"};
    ArrayList<Instructor> instructorList = new ArrayList<Instructor>();


    private Instructors() {

        if (INSTANCE == null) {
            for (int i = 0; i < InstructorsName.length; i++) {
                Instructor instructor = new Instructor(InstructorsName[i]);
                instructorList.add(instructor);
            }
        }
    }

    public static Instructors getInstance() {

        return INSTANCE;
    }
}
