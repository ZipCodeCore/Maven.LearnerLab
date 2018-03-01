package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private String name;
    private double totalStudyTime;

    public Student(long id) {
        super(id);
        this.name = name;
        this.totalStudyTime = totalStudyTime;
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
