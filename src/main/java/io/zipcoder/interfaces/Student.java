package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student() {
        this.totalStudyTime = 0;
    }

    public Student(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    public Student(long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}
