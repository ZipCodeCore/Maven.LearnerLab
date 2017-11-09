package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    double totalStudyTime;

    public Student(long id) {
        super(id);
    }

    public Student(String name, long id){
        super(name, id);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }

}