package io.zipcoder.interfaces;

public interface Teacher {

    void teach(Learner learn, double numberOfHours);

    void lecture(Learner[] learners, double numberOfHours);
}
