package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    Instructor(Long id, String name) { //default person. super cuz instructor is subclass
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner studentLearners : learners){    // for each Learner in array learners
            studentLearners.learn(numberOfHoursPerLearner); //each learner can learn in
                                                            //divided hours by each student
                                                            //in learners array.
        }
    }
}
