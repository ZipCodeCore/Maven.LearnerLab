package io.zipcoder.interfaces;

import interfaces.Learner;
import interfaces.Teacher;

public class Instructor extends Person implements Teacher {


//-----------  constructor  ---------------------------
    public Instructor(Long id, String name) {
        super(id, name);
    }


//-----------  interfaces  ---------------------------

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for(Learner eachLearner : learners){
            eachLearner.learn(numberOfHoursPerLearner);
        }
    }
}
