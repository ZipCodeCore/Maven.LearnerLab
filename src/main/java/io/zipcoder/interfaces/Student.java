package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime = getTotalStudyTime() + numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
