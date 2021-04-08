package io.zipcoder.interfaces;

public class Instructor extends Person<Instructor> implements Teacher {

    public Instructor(Long id){
        super(id);
    }


    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours){
        //Instructor should have a concrete implementation of the
        // lecture method which invokes the learn method on each of the elements
        // in the specified array of Learner objects.
        for(Learner l : learners){
            l.learn(numberOfHours / learners.length);
        }
    }

}
