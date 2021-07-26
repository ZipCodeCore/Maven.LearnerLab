package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    Leon(111L, "Leon"),
    Dolio(112L, "Dolio"),
    Kris(113L, "Kris");

    final Instructor instructor;
    double timeWorked;

    Educator(Long id, String name) {
        instructor = new Instructor(id, name);
        Instructors.getInstance().add(instructor);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = (numberOfHours / learners.length);
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
        timeWorked += numberOfHours;
    }
}
