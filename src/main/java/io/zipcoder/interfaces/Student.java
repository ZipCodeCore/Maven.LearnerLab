package io.zipcoder.interfaces;

public class Student extends Person implements ILearner {

    private double totalStudyTime;

    public Student(String name, long id) {

        super(name, id);
    }

    public Student(String name, long id, double totalStudyTime) {
        super(name, id);
        this.totalStudyTime = totalStudyTime;
    }

    public double getTotalStudyTime() {

        return totalStudyTime;
    }

    public void learn(double numberofHours) {

        totalStudyTime += numberofHours;
    }
}

/**
 * Part 3.1 - Create Student Class
 * <p>
 * Create a Student class such that:
 * Student is a subclass of Person
 * Student implements the Learner interface
 * Student should have an instance variable totalStudyTime of type double
 * Student should have a concrete implementation of the learn method which increments the totalStudyTime variable by the specified numberOfHours argument.
 * Student should have a getTotalStudyTime() method which returns the totalStudyTime instance variable.
 */


