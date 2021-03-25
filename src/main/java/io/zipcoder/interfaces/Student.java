package io.zipcoder.interfaces;

public class Student extends Person implements Learner
{
    private double totalStudyTime;

    //Student constructor that takes in an id that references back to the parent class
    public Student(String name, long id)
    {
        super(name, id);
    }

    //All methods of an interface default to public therefore define it.
    public void learn (double numberOfHours)
    {
        totalStudyTime += numberOfHours;

    }

    public double getTotalStudyTime()
    {
        return totalStudyTime;
    }
}
