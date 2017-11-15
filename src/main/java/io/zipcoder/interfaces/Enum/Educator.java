package io.zipcoder.interfaces.Enum;

import io.zipcoder.interfaces.Class.Instructor;
import io.zipcoder.interfaces.Class.Instructors;
import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.Interface.Teacher;

public enum Educator implements Teacher {
    TARIQ,LEON,DOLIO;

    private final Instructor instructor;

    private final Instructors instructors = Instructors.getInstructors();

    Educator(){
        long Id = instructors.getArray().length+1000;
        this.instructor = new Instructor(Id,name());
        instructors.add(instructor);
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner,numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
    }
}
