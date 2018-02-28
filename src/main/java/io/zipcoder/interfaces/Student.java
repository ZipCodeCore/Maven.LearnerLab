package io.zipcoder.interfaces;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public class Student extends Person<Student> implements Learner {
    private double totalStudyTime;

    Student(long id) {
        super(id);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
