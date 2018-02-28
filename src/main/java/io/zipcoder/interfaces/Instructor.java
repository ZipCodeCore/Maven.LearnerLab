package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor() {
    }

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }


}
