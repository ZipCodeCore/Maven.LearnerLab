package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }
    public  void lecture(Learner[] learnersArray,double numberOfHours){
        for (Learner learnerObj:learnersArray) {
            learnerObj.learn(numberOfHours/learnersArray.length);

        }
    }

}
