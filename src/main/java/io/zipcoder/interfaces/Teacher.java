package io.zipcoder.interfaces;

public interface Teacher {

    public void teach(Learner learner, double numberOfHours);
    public void lecture(Learner[] learners, double numberOfHours);

}
