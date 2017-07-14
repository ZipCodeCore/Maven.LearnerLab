package io.zipcoder.interfaces;


public class Student extends Person implements Learner {


    private double totalStudyTime;

    Student(String name) {
        super(name);
    }

    public void learn (double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
