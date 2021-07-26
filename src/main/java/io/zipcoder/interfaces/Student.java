package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    double totalStudyTime;



    public Student(long id, String name) {

        super(id, name);
    }

    @Override
    public void learn(Double numbersOfHours) {
        totalStudyTime += numbersOfHours;

    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
        //antes 0;
    }


}
