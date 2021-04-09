package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    double totalStudyTime;

    public Student(long id) {
        super(id);

    }
    public double learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
        return numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
