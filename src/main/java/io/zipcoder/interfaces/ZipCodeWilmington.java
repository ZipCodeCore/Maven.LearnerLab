package io.zipcoder.interfaces;
import java.util.Arrays;


public class ZipCodeWilmington extends People {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    Students students = Students.getINSTANCE();
    Instructors instructors = Instructors.getINSTANCE();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = (Instructor) instructors.findById(id);
        instructor.lecture(students.getArray(), numberOfHours);
    }
}
