package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;
    private String name;

    public Student(long id) {
        super(id);
        this.name = "";
    }

    @Override
    public long getId(){
        return super.id;
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
