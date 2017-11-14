package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private double totalStudyTime = 0;

    public Student(String name, long id) {
        super(name, id);
    }

    public Student(long id) {
        super(id);
    }

    public void learn(double numberOfHours){
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}

