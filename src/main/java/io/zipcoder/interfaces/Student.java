package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    double totalStudyTime;
    Student(Long id, String name, double totalStudyTime) {

        super(id, name);
        this.totalStudyTime = totalStudyTime; //forgot to put in for learn test
    }

    public void learn(double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
