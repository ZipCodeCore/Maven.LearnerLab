package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {


    @Override
    public void teach(Learner learn, double numberOfHours) {
        learn.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner: learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
