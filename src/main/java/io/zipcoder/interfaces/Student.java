package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    public Student(long id) {
        super(id);
    }

    double totalStudyTime = 0;

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}
