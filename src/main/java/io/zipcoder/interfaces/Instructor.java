package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {


    public Instructor(long id) {
        super(id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learner, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learner.length;
        for(int i = 0; i <learner.length; i++) {
            learner[i].learn(numberOfHoursPerLearner);
        }

    }
}
