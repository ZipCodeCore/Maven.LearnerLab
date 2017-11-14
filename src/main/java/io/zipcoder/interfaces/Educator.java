package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    TARIQ_HOOK(0.0), DOLIO_DURANT(0.0), LEON_HUNTER(0.0);

    public Double getTimeworked() {
        return timeworked;
    }

    Double timeworked;

    Educator(Double timeWorked) {
        this.timeworked = timeWorked;
    }

    public void addTimeWorked(Double timeWorked) {
        this.timeworked += timeWorked;
    }

    @Override
    public void teach(Learner learn, double numberOfHours) {
        this.addTimeWorked(numberOfHours);
        learn.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        this.addTimeWorked(numberOfHours);
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
