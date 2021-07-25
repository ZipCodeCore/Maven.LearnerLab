package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class Instructor extends Person  implements Teacher{
    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner element:learners){
            element.learn(numberOfHoursPerLearner);
        }
    }
}
