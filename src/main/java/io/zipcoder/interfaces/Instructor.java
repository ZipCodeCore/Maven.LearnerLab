package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (int i = 0; i < learners.length; i++) {
            Double numOfHoursPerLearner = numberOfHours/ learners.length;
            learners[i].learn(numOfHoursPerLearner);
        }
    }
}
