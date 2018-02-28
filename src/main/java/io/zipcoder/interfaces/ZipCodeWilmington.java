package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private Students students;
    private Instructors instructors;


    private ZipCodeWilmington() {
        this.students = Students.getInstance();
        this.instructors = Instructors.getInstance();
    }

    public static ZipCodeWilmington getInstance() {

        if (INSTANCE == null) {
            new ZipCodeWilmington();
        }
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {

//        ArrayList<Person> abc = students.getArray();
//
//        Student[] sa = abc.toArray();


        teacher.lecture((Student[]) students.getArray().toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor t = (Instructor) instructors.findByID(id);

        t.lecture((Student[]) students.getArray().toArray(), numberOfHours);
    }


}
