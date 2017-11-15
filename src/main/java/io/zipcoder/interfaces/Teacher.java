package io.zipcoder.interfaces;

import java.util.ArrayList;

public interface Teacher {

    public void teach(Learner learner, double numberOfHours);

    public void lecture(ArrayList<Student> learners, double numberOfHours);

}
