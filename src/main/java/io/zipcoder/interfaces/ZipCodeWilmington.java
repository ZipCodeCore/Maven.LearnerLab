package io.zipcoder.interfaces;

import java.util.ArrayList;

public class ZipCodeWilmington {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }


    public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture((Learner[]) students.getArray(), numberOfHours);

    }

    public void hostLecture(long id, double numberOfHours) {

        Instructor instructor = (Instructor) instructors.findByID(id);

        instructor.lecture((Learner[]) students.getArray(), numberOfHours);


    }
}





