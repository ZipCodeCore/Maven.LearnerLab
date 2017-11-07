package io.zipcoder.interfaces.Class;

import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.Interface.Teacher;

import java.util.ArrayList;

public class ZipCodeWilmington {
    private Students students = Students.getINSTANCE();
    private Instructors instructors = Instructors.getInstructors();

    public void hostLecture(double numberOfHours){
        Learner[] learnersList = students.getArray().toArray(new Learner[students.getCount()]);
        Teacher[] teachersList = instructors.getArray().toArray(new Teacher[instructors.getCount()]);
        for(Teacher teacher:teachersList){
            teacher.lecture(learnersList,numberOfHours);
        }



    }
}
