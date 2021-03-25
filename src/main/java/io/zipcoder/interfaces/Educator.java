package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    SAM,
    NICK,
    FRANK,
    CHRIS;

    private final Instructor instructor;
    private Double timeWorked = 0.0;

    Educator() {

        this.instructor = new Instructor((long) ordinal(), name());

    }


    public Double timeWorked() {

        return timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {

        timeWorked += numberOfHours;
        this.instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {

        timeWorked += numberOfHours;
        this.instructor.lecture(learners, numberOfHours);
    }
}
