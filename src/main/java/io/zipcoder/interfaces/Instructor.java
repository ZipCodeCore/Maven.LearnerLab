package io.zipcoder.interfaces;

import Interfaces.Learner;
import Interfaces.Teacher;

public class Instructor extends Person implements Teacher {

    public Instructor(String name, long id){
        super(name, id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/learners.length;
        for(Learner learner : learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }

}
