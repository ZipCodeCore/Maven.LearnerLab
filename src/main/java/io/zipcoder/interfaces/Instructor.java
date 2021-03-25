package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    Instructor(Long id,String name){
     super(id,name);
    }
    public void teach(Learner learner, double numberOfHours) {
      learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner learners1: learners){
        learners1.learn(numberOfHoursPerLearner);
        }
    }
}
