package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id) {
        super(id);
        totalStudyTime = 0;
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
