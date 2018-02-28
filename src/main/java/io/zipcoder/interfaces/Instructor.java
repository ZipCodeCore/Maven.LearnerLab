package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
    public Instructor(long id){
        super(id);
    }

    public void teach (Learner leaner, double numberOfHours){
        leaner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for(Learner element : learners){
            teach(element, numberOfHoursPerLearner);



         }

     }

}

