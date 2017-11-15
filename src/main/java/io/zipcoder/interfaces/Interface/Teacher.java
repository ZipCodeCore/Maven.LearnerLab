package io.zipcoder.interfaces.Interface;

import java.util.ArrayList;

public interface Teacher {
    void teach(Learner learner, double numberOfHours);

    void lecture(Learner[] learners, double numberOfHours);
}
