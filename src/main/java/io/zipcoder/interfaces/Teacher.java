package io.zipcoder.interfaces;

public interface Teacher {

    //abstract methods can't have a body
    public void teach(Learner learner, double numberOfHours);

    public void lecture(Learner[] learners, double numberOfHours);
}
