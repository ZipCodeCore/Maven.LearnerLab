package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    YOUNGER(101L, "Christopher"),
    SLEUTH(102L, "Dolio"),
    DEDEUS(103L, "Roberto"),
    MIRANDA(104L, "chris"),
    NOBLES(105L, "Sian");

    private long id;
    private String name;
    private double timeWorked;

    Educator(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getTimeWorked() {
        return timeWorked;
    }


    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked += numberOfHours;
    }


    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
        this.timeWorked += numberOfHours;
    }
}