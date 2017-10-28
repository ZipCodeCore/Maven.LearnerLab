package io.zipcoder.interfaces;//Part 3.1 - Create io.zipcoder.interfaces.Student Class
//
//Part 3.1 - Create Student Class
//
//        Create a Student class such that Student is a subclass of Person
//        Student implements the Learner interface
//        Student should have an instance variable totalStudyTime of type double
//        Student should have a concrete implementation of the learn method which increments the total StudyTime
//        variable by the specified numberOfHours argument.
//        Student should have a getTotalStudyTime() method which returns the totalStudyTime instance variable.


public class Student extends Person implements Learner{

    private double totalStudyTime;

    Student(long id){
        super(id);
    }

    public void learn(double numberOfHours){
        totalStudyTime += numberOfHours;

    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }


}
