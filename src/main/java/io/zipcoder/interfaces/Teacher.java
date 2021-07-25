package io.zipcoder.interfaces;

/**
 * Create a Teacher interface.
 *
 * Teacher should declare a teach method signature:
 * Method name: teach
 * Method parameters:
 * Learner learner
 * double numberOfHours
 * Method return-type: void
 *
 * Teacher should declare a lecture method signature:
 * Method name: lecture
 * Method parameters:
 * Learner[] learners
 * double numberOfHours
 * Method return-type: void
 */

public interface Teacher {
    void teach(Learner learner, Double numberOfHours);
    void lecture(Learner[] learners,Double numberOfHours);
}
