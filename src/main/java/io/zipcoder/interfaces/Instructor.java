package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    Educator educator;

    public Instructor(int id, String name) {
        super(id, name);
        educator=Educator.valueOf(name);
    }

    public double getTimeWorked(){
        return educator.getTimeWorked();
    }

    public void teach(Learner learner, double numberOfHours) {
        educator.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        educator.lecture(learners, numberOfHours);
        //double numberOfHoursPerLearner=numberOfHours/learners.length;
        //for (Learner learner :learners){
        //    learner.learn(numberOfHoursPerLearner);
        // }
    }

}
