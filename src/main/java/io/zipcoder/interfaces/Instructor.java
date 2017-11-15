package io.zipcoder.interfaces;

public class Instructor extends Person implements  Teacher{


    public Instructor(long id) {
        super(id);
    }

    public Instructor(long id, String name) {
        super(id, name);
    }



    public void teach(Learner student, double numberOfHours) {
        student.learn(numberOfHours);

    }

    public void lecture (Learner[] student, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / student.length;
        for (int i =0; i <student.length; i++)
            student[i].learn(numberOfHoursPerLearner);
           }
    @Override

    public String toString (){

        return getName().toString();
    }



    }





