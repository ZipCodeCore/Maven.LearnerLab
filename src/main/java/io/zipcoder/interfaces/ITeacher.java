package io.zipcoder.interfaces;

public interface ITeacher {

    public void teach(ILearner learner, double numberOfHours);

    public void lecture(ILearner[] learners, double numberOfHours);
}


/**
 * Part 4.0 - Create Teacher Interface
 * <p>
 * Create a Teacher interface.
 * Teacher should declare a teach method signature:
 * <p>
 * Method name: teach
 * Method parameters:
 * Learner learner
 * double numberOfHours
 * Method return-type: void
 * Teacher should declare a lecture method signature:
 * <p>
 * Method name: lecture
 * Method parameters:
 * Learner[] learners
 * double numberOfHours
 * Method return-type: void
 */
