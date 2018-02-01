package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher {

    Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(ArrayList<Student> learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.size();

        for (int i = 0; i < learners.size(); i++) {
            learners.get(i).learn(numberOfHoursPerLearner);
        }

    }
}
