package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    TARIQ(0),
    LEON(1),
    NHU(2),
    KRIS(3);

    private final Instructor instructor;

    protected double timeWorked = 0.0;

    Educator(long id) {
        this.instructor = new Instructor(id);
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        this.timeWorked = numberOfHours;
    }

    public void lecture(Learner[] learner, double numberOfHours) {
        instructor.lecture(learner, numberOfHours);
        this.timeWorked = numberOfHours;
    }
}
