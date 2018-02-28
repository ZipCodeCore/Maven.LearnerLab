package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(long id) {
        super(id);
    }

    public Instructor(String name) {
        super(name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture (Learner[] learners, double numberOfHours) {
        for (Learner learner : learners) {
            // for each learner in our learner array
            learner.learn(numberOfHours/learners.length);
            // they will learn for how ever many hours divided evenly amongst themselves

        }
    }
}
