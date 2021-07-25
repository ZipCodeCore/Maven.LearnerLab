package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private long id;
    private String name;
    private Double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    public Student() {
        super(0,"");
    }

    @Override
    public void learn(Double numberOfHours) {
        this.totalStudyTime = numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }

}
