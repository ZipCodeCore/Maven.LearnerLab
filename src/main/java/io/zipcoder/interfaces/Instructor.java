package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(Educator s, long id) {
        super(id);
    }

    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }

    public void lecture(Person[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
       for (int i = 0; i < learners.length; i++){
           learners[i].learn(numberOfHoursPerLearner);
       }
    }

}


