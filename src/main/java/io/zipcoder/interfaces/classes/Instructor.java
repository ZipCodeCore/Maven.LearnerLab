package io.zipcoder.interfaces.classes;

import io.zipcoder.interfaces.interfaces.Learner;
import io.zipcoder.interfaces.interfaces.Teacher;

public class Instructor extends Person implements Teacher {


    public Instructor(long id) {
        super(id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for (int i = 0; i < learners.length; i++) {
            learners[i].learn(numberOfHoursPerLearner);
        }

    }
}
