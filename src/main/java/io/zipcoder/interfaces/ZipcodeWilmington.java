package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ZipcodeWilmington {

    public Students students = Students.getInstance();
    public Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
    Instructor elQVaADar = instructors.findById(id);
       elQVaADar.lecture(students.toArray(), numberOfHours);

    }





}
