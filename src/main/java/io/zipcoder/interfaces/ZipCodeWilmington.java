package io.zipcoder.interfaces;

import java.util.ArrayList;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private ZipCodeWilmington(){

    }

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();


    //method
    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }



    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }
    public void hostLecture(long id, double numberOfHours){
        Instructor instructor1 =  instructors.findById(id);
        instructor1.lecture(students.getArray(), numberOfHours);
    }
}
