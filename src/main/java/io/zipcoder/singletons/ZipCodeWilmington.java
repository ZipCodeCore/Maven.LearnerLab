package io.zipcoder.singletons;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;
import java.util.Arrays;

public final class ZipCodeWilmington {

    public Students students = Students.getInstance();
    public Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        Learner[] learners = Arrays.copyOf(students.getArray(), students.getArray().length, Learner[].class);
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        hostLecture((Teacher)instructors.findById(id), numberOfHours);
    }

}
