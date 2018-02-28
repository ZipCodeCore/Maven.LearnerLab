package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
    protected double numberOfHoursPerLearner;

    public Instructor(String name, long id) {
        super(name, id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learner(numberOfHours);

    }

    public void lecture(Learner[] learners, double numberOfHours) {
        numberOfHoursPerLearner=numberOfHours/learners.length;

    }
    public double getNumberOfHoursPerLearner(){
        return numberOfHoursPerLearner;
    }


//    Create an Instructor class such that:
//    Instructor is a subclass of Person
//    Instructor implements the Teacher interface
//    Instructor should have a concrete implementation of the teach method which invokes the learn method on the specified Learner object.
//    Instructor should have a concrete implementation of the lecture method which invokes the learn method on each of the elements in the specified array of Learner objects.
//    numberOfHours should be evenly split amongst the learners.
//    double numberOfHoursPerLearner = numberOfHours / learners.length;



}
