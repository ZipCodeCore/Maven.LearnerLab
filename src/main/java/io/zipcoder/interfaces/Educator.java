package io.zipcoder.interfaces;

public enum Educator implements Teacher { Dolio("Dolio"), Leon("Leon"), Tariq("Tariq");

    private final Instructor instructor;
    double timeWorked;

    Educator(String name) {
        Instructor instructor = new Instructor();
        this.instructor = instructor;
        this.timeWorked = 0d;

    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }
}
