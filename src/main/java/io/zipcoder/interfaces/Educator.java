package io.zipcoder.interfaces;

import java.util.ArrayList;

public enum Educator implements Teacher {
    TARIQ_HOOK, LEON_HUNTER, IYASU_WATTS, DOLIO_DURANT
    ;

    private final Instructor instructor;
    private double timeWorked = 0;

    Educator(){
        instructor = new Instructor(Instructors.getInstance().generateId(), name());
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner,numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(ArrayList<Student> learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }
}
