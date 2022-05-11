package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    NHU(20),
    KRIS(21),
    LEON(22),
    TARIQ(23);

    final Instructor instructor;

    Educator(int id) {
        instructor = new Instructor(id);
    }
    double timeWorked;

    public double getTimeWorked() {
        return timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.timeWorked += numberOfHours;
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.timeWorked += numberOfHours;
        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for (int i = 0; i < learners.length; i++) {
        learners[i].learn(numberOfHoursPerLearner);
        }

    }
}
