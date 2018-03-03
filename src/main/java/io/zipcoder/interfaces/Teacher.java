package io.zipcoder.interfaces;

public interface Teacher {

    //abstract methods can't have a body
    void teach(Learner learner, double numberOfHours);

    void lecture(Learner[] learners, double numberOfHours);
}
