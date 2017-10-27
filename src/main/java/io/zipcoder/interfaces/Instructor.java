package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(String name, Long id){
        super(name, id);
    }

    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        Double numberOfHoursPerLearner = numberOfHours/learners.length;
        for (Learner learner: learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
