package io.zipcoder.interfaces.Enum;

import io.zipcoder.interfaces.classes.Instructor;
import io.zipcoder.interfaces.classes.Instructors;
import io.zipcoder.interfaces.interfaces.Learner;
import io.zipcoder.interfaces.interfaces.Teacher;

public enum Educator implements Teacher{

    TARIQ(1),LEON(2),DOLIO(3);



    private final long id;

    Educator(long id){
        this.id = id;
        this.instructor = new Instructor(this.getId(),name());
        instructors.add(instructor);
    }


    private Instructor instructor;
    private Instructors instructors = Instructors.getInstance();

    public long getId() {
        return id;
    }


    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner,numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
    }
}
