package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    Tariq(1, "Tariq"), Leon(2, "Leon"),Zach(3, "Zach");

    private double timeWorked = 0.0;
    private String name;
    private int id;

    Educator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public double getTimeWorked() {
        return timeWorked;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked += numberOfHours;
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }

    }
};



