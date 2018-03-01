package io.zipcoder.interfaces;

import Interfaces.Learner;
import Interfaces.Teacher;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington ZIPCODEWILMINGTON = new ZipCodeWilmington();
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();


    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Learner[]) students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor1 = (Instructor) instructors.findById(id);
        instructor1.lecture((Learner[]) students.getArray(), numberOfHours);
    }

    public static ZipCodeWilmington getInstance(){
        return ZIPCODEWILMINGTON;
    }
}
