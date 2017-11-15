package io.zipcoder.interfaces.Class;
import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.Interface.Teacher;

import java.util.ArrayList;

public class ZipCodeWilmington {
    private Students students = Students.getINSTANCE();
    private Instructors instructors = Instructors.getInstructors();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray().toArray(new Learner[students.getCount()]),numberOfHours);
    }

    public void hostLecture(long ID , double numberOfHours){
        instructors.findById(ID).lecture(students.getArray().toArray(new Learner[students.getCount()]),numberOfHours);
    }
}
