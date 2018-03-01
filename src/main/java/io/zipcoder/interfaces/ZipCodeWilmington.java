package io.zipcoder.interfaces;

import Interfaces.Learner;
import Interfaces.Teacher;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington ZIPCODEWILMINGTON = new ZipCodeWilmington();
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor1 = instructors.findById(id);
        instructor1.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(Educator educator, double numberOfHours){
        educator.lecture(students.getArray(), numberOfHours);
    }



    public static ZipCodeWilmington getInstance(){
        return ZIPCODEWILMINGTON;
    }
}
