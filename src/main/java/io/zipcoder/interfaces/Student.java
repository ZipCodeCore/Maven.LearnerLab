package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    public double totalStudyTime;

    public Student(){
        }

    public Student(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }
    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
