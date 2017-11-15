package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    TARIQ("Tariq"),
    DOLIO("Dolio"),
    LEON("Leon");

    Educator(String name) {
        this.instructor = new Instructor();
    }

    final Instructor instructor;
    double timeWorked = 0;

    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public double getTimeWorked(){
        return timeWorked;
    }
}
