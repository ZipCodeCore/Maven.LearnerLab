package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    private double timeWorked;
    private final long id;

    KRIS(0),
    TARIQ(1),
    LEON(2);

    
    //constructor
    Educator(long id) {
        this.id =id;
    }

    public void teach(Learner learner, double numberOfHours) {
    }

    public void lecture(Learner[] learners, double numberOfHours) {
    }

}
