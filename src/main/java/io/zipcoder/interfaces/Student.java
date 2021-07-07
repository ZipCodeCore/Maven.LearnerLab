package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    protected double totalStudyTime;

    public Student(String name, long id) {
        super(name, id);
    }

    public Student(String name, long id, double totalStudyTime) {
        super(name, id);
        this.totalStudyTime = totalStudyTime;
    }


    public void learner(double numberOfHours) {
        totalStudyTime+=numberOfHours;

    }


    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
