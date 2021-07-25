package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime;

    Student(long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
