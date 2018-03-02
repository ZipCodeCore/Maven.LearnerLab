package io.zipcoder.interfaces;

public interface Teacher
{
    void teach (Learner learner, double numberOfHours);

    //an array of learners
    void lecture (Learner [] learner, double numberOfHours);
}
