package io.zipcoder.interfaces;
//Student subclass of Person implements Learner interface
public class Student extends Person implements Learner {

    double totalStudyTime = 10;



    public Student(long id, String name) {
        super(id, name);
    }


    public void learn(double numberOfHours){
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}
