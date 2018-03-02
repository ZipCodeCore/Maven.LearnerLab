package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class ZipCodeWilmington extends People {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static Students students = Students.getInstance();
    private static Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {

    }

    public Person[] getArray() {
        return new Person[0];
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        Student[] allStudents = students.getArray();
        teacher.lecture( allStudents, numberOfHours);
    }

   public void hostLecture(long id, double numberOfHours){
       Student[] allStudents =   students.getArray();
       Instructor instructor = instructors.findById(id);
       instructor.lecture(allStudents, numberOfHours);
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

}
