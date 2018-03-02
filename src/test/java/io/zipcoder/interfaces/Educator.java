package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    TARIQ(1000), WILHELM(1001), LEON(1002), FROILAN(1003), NHU(1004), KRIS(1005), DOLIO(1006);

    private double timeWorked;

    Educator(long i) {
    }

    public void teach(Learner learner, double numberOfHours) {
            learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(int i = 0; i<learners.length; i++) {
            learners[i].learn(numberOfHoursPerLearner);
        }
    }
}
