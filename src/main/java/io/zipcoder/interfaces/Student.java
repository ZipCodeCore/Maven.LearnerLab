package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    public Student(Long id, String name) {
        super(id, name);
    }

    double totalStudyTime;


    @Override
    public void learn(double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
