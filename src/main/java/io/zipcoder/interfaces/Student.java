package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime = 0;

    public Student(long id, String name) {

        super(id, name);
    }

    public double learn(double numberOfHours) {

        return totalStudyTime += numberOfHours;
    }

    double getTotalStudyTime() {

        return totalStudyTime;
    }
}
