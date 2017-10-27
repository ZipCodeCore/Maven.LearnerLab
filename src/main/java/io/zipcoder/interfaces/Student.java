package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    private Double totalStudyTime = 0d;

    public Student(String name, Long id){
        super(name, id);
    }

    public void learn(Double numberOfHours){
        this.totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime(){
        return this.totalStudyTime;
    }
}
