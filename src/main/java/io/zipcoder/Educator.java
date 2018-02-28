package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;
import io.zipcoder.singletons.Instructors;

public enum Educator implements Teacher{
    TARIQ("Tariq", 0000L),
    DOLIO("Dolio", 0001L),
    LEON("Leon", 0002L),
    KRIS("Kris", 0003L),
    WILHELM("Wilhelm", 0004L),
    FROILAN("Froilan", 0005L),
    NHU("Nhu", 0006L);

    final Instructor instructor;
    double timeWorked = 0;

    public double getTimeWorked() {
        return timeWorked;
    }

    Educator(String name, long id){
        this.instructor = new Instructor(name, id);
        Instructors.getInstance().add(this.instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
