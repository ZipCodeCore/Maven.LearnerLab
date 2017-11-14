package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(){super();}

    public Instructor(int passedID, String passedName){
        super(passedID, passedName);
    }

    public void teach(Learner learner, double passedNumberOfHours){
        learner.learn(passedNumberOfHours);
    }

    public void lecture(Learner[] learners, double passedNumberOfHours){
        double numberOfHoursPerStudent=passedNumberOfHours/learners.length;
        for(Learner learner : learners){
            learner.learn(numberOfHoursPerStudent);
        }
    }




}
