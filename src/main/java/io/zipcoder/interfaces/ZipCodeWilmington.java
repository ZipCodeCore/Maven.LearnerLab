package io.zipcoder.interfaces;

import java.util.zip.ZipInputStream;

public class ZipCodeWilmington {

    private static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    Students students = Students.getInstance();

    Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {

        if (INSTANCE == null) {
            INSTANCE = new ZipCodeWilmington();
            }
    }

    public static ZipCodeWilmington getInstance() {

        return INSTANCE;
    }


    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Learner[]) students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        hostLecture( (Teacher) instructors.findById(id), numberOfHours);

    }
}
