package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    Learner[] learners;
    double numberOfHoursPerLearner;

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner element : learners) {
            element.learn(numberOfHoursPerLearner);
        }
    }
}
