package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public class Instructor extends Person implements Teacher{

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/learners.length;
        for (Learner learner:learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }

}
