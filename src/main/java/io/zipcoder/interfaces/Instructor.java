package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
    private double totalStudyTime;
    public Instructor(long id){
        super(id);
    }

    public void teach(Learner learner, double numberOfHours){
         learner.learn(numberOfHours);
    }
    public void lecture(Learner[] learners, double numberOfHours){
       double totalStudyTimePerLearner =  (numberOfHours / learners.length);
        for(Learner learner : learners){
            learner.learn(totalStudyTimePerLearner);
        }
    }
}
