package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    Leon(1l, "Hunter"), Dolio(2l, "Durant"), Kris(3l, "Younger");
    String name;
    Long id;
    Double timeWorked;

    Educator(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner element : learners) {
            element.learn(numberOfHoursPerLearner);
        }
        this.timeWorked += numberOfHours;
    }
}