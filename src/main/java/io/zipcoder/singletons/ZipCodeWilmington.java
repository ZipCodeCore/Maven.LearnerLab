package io.zipcoder.singletons;

import io.zipcoder.Educator;
import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public final class ZipCodeWilmington {

    public Students students = Students.getInstance();
    public Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        Learner[] learners = students.getArray();
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        hostLecture(instructors.findById(id), numberOfHours);
    }

    public void hostLecture(Educator educator, double numberOfHours){
        hostLecture(educator.getInstructor(), numberOfHours);
        educator.addTimeWorked(numberOfHours);
    }

}
