package io.zipcoder.interfaces;

import java.util.List;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for(Learner learner: learners) {
            learner.learn(numberOfHours);
        }
    }
}
