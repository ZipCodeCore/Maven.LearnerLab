package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    private double totalStudyTime = 0;

    public Student(long id, String name) {
        super(id, name);
    }
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " ID: " + this.getId();
    }
}
