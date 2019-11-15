package io.zipcoder.interfaces;

import interfaces.Learner;
import interfaces.Teacher;

public enum Educator implements Teacher {

    DOLIO (new Instructor(20L,"Wil"),0.0),
    ROBERTO (new Instructor(22L,"Jack"),0.0);

    private final Instructor instructor;
    private double timeWorked;


    Educator(Instructor instructor, double timeWorked) {
        this.instructor = instructor;
        this.timeWorked = timeWorked;
    }

    public double getTimeWorked() {
        return this.timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner,numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners,numberOfHours);
        this.timeWorked += numberOfHours;
    }
}
