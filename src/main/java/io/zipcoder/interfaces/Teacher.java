package io.zipcoder.interfaces;

public interface Teacher {
    void teach(Learner learner, Double numberOfHours);
    void lecture(Learner[] learners, Double numberOfHours);
}
