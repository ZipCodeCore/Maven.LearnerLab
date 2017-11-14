package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class Instructor extends Person implements Teacher, Learner {


    public Instructor(long id) {
        super(id);
    }

    public Instructor(String name) {
        super(name);
    }

    public void teach(Learner learner, double numberOfHours) {

        learn(numberOfHours);

    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for(int i = 0 ; i <learners.length; i ++){
            learners[i].learn(numberOfHoursPerLearner);
        }
    }


    public void learn(double numberOfHours) {

    }
}

