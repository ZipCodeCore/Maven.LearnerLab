package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON,
    DOLIO,
    KRIS;


    private final Instructor instructor;
    double timeWorked;

    Educator() {
        this.instructor = new Instructor((long) ordinal(),name());
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
        timeWorked += numberOfHours;
    }
    public double getTimeWorked() {
        return timeWorked;
    }
}
