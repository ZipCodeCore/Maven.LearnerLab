package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    tariq(0),
    dolio(1),
    kris(2),
    leon(3);


    private final Instructor instructor;
    protected double timeWorked = 2d;

    Educator(long id){
        this.instructor = new Instructor(id);
    }



    public void teach(Learner learner, double numberOfHours) {

        learner.learn(numberOfHours + timeWorked);
    }

    public void lecture(Learner[] learners, double numberOfHours) {

        double numberOfHoursPerLearner = (numberOfHours + timeWorked) / learners.length;
        for (Learner l: learners) {
            l.learn(numberOfHoursPerLearner);
        }
    }
}
