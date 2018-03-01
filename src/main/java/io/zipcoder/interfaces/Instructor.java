package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Instructor extends Person implements ITeacher {

    public Instructor(long id) {

        super(id);
    }

    public Instructor(String name, long id) {

        super(name, id);
    }


    public void teach(ILearner learner, double numberOfHours) {

        learner.learn(numberOfHours);
    }

    public void lecture(ILearner[] learners, double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours / learners.length;

    }
}

/**
 * Part 5.1 - Create Instructor Class
 * <p>
 * Create an Instructor class such that:
 * Instructor is a subclass of Person
 * Instructor implements the Teacher interface
 * Instructor should have a concrete implementation of the teach method
 * which invokes the learn method on the specified Learner object.
 * Instructor should have a concrete implementation of the lecture method
 * which invokes the learn method on each of the elements in the specified array of Learner objects.
 * numberOfHours should be evenly split amongst the learners.
 * double numberOfHoursPerLearner = numberOfHours / learners.length;
 */
