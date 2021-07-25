package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {


    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
    learner.learn(numberOfHours);
    //invokes the learn method on the specified Learner object.
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
    for(Learner i : learners){
        i.learn(numberOfHours / learners.length);
    }


    }
}
