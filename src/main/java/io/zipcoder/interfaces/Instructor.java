package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture ( Double numberOfHours, Learner[] learners) {
        Double numberOfHoursPerLearner = numberOfHours / learners.length;
        for( Learner student : learners) {
            student.learn(numberOfHoursPerLearner);
        }

    }
}
