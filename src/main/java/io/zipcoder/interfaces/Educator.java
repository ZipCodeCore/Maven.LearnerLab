package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;
import io.zipcoder.interfaces.Instructors;

public enum Educator implements Teacher {

    TARIQ(18L, "Tariq"),
    FROILAN(19L, "Froilan"),
    KRIS(20L, "Kris"),
    WILHEM(21L, "Wilhem"),
    LEON(22L, "Leon"),
    NHU(23L, "Nhu"),
    MELANIE(24L, "Melanie");

    final Instructor instructor;
    double timeWorked;

    Educator(long id, String name) {
        this.instructor = new Instructor(id, name);
        Instructors.getInstance().add(this.instructor);
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void addTimeWorked(double timeWorked) {
        this.timeWorked += timeWorked;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
