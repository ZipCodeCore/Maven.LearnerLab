package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    LEON(4321), TARIQ(5432), KRIS(6543), WILHEM(7654);

    double timeWorked;
    long id;

    Educator(long id) {
        this.id = id;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            teach(learner, numberOfHoursPerLearner);
        }
    }

}
