package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private double totalStudyTime;
    private String name;

    public Student(long id) {
        super(id);
        this.name = "";
    }
    public Student(long id, String name){
        super(id);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
