package io.zipcoder.interfaces.interfaces;

import io.zipcoder.interfaces.interfaces.Learner;

public interface Teacher {

    void teach(Learner learner, double numberOfHours);

    void lecture(Learner[] learners,double numberOfHours);

}
