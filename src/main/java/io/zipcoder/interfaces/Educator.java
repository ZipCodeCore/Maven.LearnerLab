package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    LEON(4321), TARIQ(5432), KRIS(6543), WILHEM(7654);

    public final Instructor instructor;
    double timeWorked = 0;

    Educator(long id) {
        this.instructor = new Instructor(id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked = numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            teach(learner, numberOfHoursPerLearner);
        }
        this.timeWorked = numberOfHours;
    }

}
