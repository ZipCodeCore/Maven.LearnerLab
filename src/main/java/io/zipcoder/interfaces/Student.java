package io.zipcoder.interfaces;

public class Student extends Person implements Learner  {
    private Double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
        this.totalStudyTime = 0D;
    }

    public void setTotalStudyTime(Double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
