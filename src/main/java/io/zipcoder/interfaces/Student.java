package io.zipcoder.interfaces;

import Interfaces.Learner;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(String name, long id) {
        super(name, id);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }


}
