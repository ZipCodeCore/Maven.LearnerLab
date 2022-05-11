package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Learner;

public interface Teacher {

    void teach(Learner learner, double numberOfHours);

    void lecture(Learner[] learners, double numberOfHours);

}
