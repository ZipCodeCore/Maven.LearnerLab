package io.zipcoder.interfaces;

public interface Teacher {
    public void teach(Student learner, double numberOfHours);

    public void lecture(Student[] learners, double numberOfHours);
}
