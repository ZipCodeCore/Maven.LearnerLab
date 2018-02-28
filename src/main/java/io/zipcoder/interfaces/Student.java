package io.zipcoder.interfaces;

//Create a Student class such that:
//        Student is a subclass of Person
//        Student implements the Learner interface
//Student should have an instance variable totalStudyTime of type double
//        Student should have a concrete implementation of the learn method which increments the totalStudyTime variable by the specified numberOfHours argument.
//        Student should have a getTotalStudyTime() method which returns the totalStudyTime instance variable.


public class Student extends Person implements Learner{
    protected double totalStudyTime;
    public Student(String name, long id) {
        super(name, id);
    }

    public Student(String name, long id, double totalStudyTime) {
        super(name, id);
        this.totalStudyTime = totalStudyTime;
    }
//    public Student(){
//        this.totalStudyTime=0;
//    }



    public void learner(double numberOfHours) {
        totalStudyTime+=numberOfHours;

    }


    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
