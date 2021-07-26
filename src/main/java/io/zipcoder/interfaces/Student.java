package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private double totalStudyTime=0.0;

    public Student(Long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        totalStudyTime=getTotalStudyTime()+numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
