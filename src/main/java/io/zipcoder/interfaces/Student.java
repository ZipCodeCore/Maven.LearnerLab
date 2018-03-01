package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long id) {
        super(id);
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
