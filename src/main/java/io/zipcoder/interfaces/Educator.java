package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    ORACLE,
    DOLIO,
    Kris;


    private final Instructor instructor;
    double timeWorked;

      Educator() {
        this.instructor = new Instructor((long) ordinal(), name());
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);

    }
}
