package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
Educator name;

    public Instructor(int id, Educator name){
        super(id);this.name=name;
    }

    public void teach (Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }

    public void lecture (Learner [] learners,double numberOfHours){

        double numberOfHoursPerLearner=numberOfHours/learners.length;
        for (Learner learner :learners){
            learner.learn(numberOfHoursPerLearner);
        }
   }

}
