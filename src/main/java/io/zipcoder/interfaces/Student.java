package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    Double totalStudyTime = 0.0;

    public Student(Long id, String name) {
        super(id, name);
    }


    public void learn(Double hours){
        totalStudyTime += hours;
    }

    public Double getTotalStudyTime(){
        return totalStudyTime;
    }
}

