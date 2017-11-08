package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor() {

    }

    public Instructor(long id, String name) {
        super(id, name);
    }


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
