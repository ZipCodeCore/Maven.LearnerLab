package io.zipcoder.interfaces.Class;

import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.Interface.Teacher;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher {


    public Instructor(long id) {
        super(id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double perStudent = numberOfHours/learners.length;
        for(Learner student:learners){
            student.learn(perStudent);
        }

    }
}
