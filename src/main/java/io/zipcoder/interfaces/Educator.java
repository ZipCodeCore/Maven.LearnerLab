package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    bob(0),
    tom(1),
    ted(2),
    fred(3);

    private final Instructor instructor;

    protected double timeWorked = 2.0;

    Educator(long id) {
        this.instructor = new Instructor(id);
    }


    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours + timeWorked);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = (numberOfHours + timeWorked) / (double)learners.length;
        for(Learner l: learners){
            l.learn(numberOfHoursPerLearner);
        }
    }
}
