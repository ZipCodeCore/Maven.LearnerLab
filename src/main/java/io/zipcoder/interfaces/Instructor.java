package io.zipcoder.interfaces;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public class Instructor extends Person<Instructor> implements Teacher {
    Instructor(long id) {
        super(id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner learner : learners)
            learner.learn(numberOfHours / learners.length);
    }
}
