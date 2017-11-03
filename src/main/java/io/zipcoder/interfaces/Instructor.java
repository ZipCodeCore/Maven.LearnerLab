package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }
    public void lecture(Learner[] learners, double numberOfHours){
        for(Learner eachLearner : learners){
            double numberOfHoursPerLearner = numberOfHours/learners.length;
            eachLearner.learn(numberOfHoursPerLearner);
        }
    }
}
