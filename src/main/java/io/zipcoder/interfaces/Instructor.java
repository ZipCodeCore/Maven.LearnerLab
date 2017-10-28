package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(long id) {
        super(id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours/learners.length;

        for (int learner=0; learner<=learners.length; learner++) {
            learners[learner].learn(numberOfHoursPerLearner);
        }
    }
}

//need to get back to....
