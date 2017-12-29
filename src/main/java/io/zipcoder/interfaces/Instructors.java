package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Instructors extends People{

    ArrayList<Instructor> instructorList = new ArrayList<Instructor>();


    private static final Instructors INSTANCE = new Instructors();


    private String [] instructorNames =
            {"Tariq Hook", "L. Dolio Durant", "Leon Hunter", "Iyasu Watts", "Frolian Miranda"};

    private Instructors()
    {
        for(int i = 0; i< instructorNames.length ; i++){
            Instructor instructor = new Instructor(instructorNames[i], i+1);
            instructorList.add(instructor);
        }
    }


    public static Instructors getInstance()
    {
        return INSTANCE;
    }


}
