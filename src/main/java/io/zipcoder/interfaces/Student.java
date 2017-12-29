package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

private double totalStudyTime = 0;

public Student(long id) {

        super(id);
    }

public Student(String name, long id) {
    super(name, id);
    }

  //learn method from Learner interface that was incomplete

    public void learn(double numberOfHours){
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime(){
        return this.totalStudyTime;
    }


}
