package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    Tariq(0.0), Leon(0.0);

    double timeWorked;

    Educator(double timeWorked) {
        this.timeWorked = timeWorked;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }

    }
}
