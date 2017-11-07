package io.zipcoder.interfaces;

public class Instructor extends Person<Person> implements Teacher{

    public Instructor(int id){
        super(id);
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
