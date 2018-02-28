package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    Learner[] learners;

    public Instructor(long id) {
        super(id);
    }

    public void teach(Learner learner, double numberOfHours) {

        learner.learn(numberOfHours);

    }

    public void lecture(Learner[] learners, double numberOfHours){
        double numberOfHoursPerLearner = numberOfHours / (double)learners.length;
        for (Learner l:learners){
            l.learn(numberOfHoursPerLearner);

        }

    }


}
