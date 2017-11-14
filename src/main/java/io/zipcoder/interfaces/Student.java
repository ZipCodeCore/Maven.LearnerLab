package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student() {
        super();
    }

    public Student(long id, String name) {
        super(id, name);
    }


    @Override
    public void learn(double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
