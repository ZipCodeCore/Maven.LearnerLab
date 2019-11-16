package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }


    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learner, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learner.length;
        for (Learner each : learner) {
            each.learn(numberOfHoursPerLearner);
        }
    }
}