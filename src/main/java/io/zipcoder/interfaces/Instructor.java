package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
    protected double numberOfHoursPerLearner;
    protected long id;

    public Instructor(String name, long id) {
        super(name, id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learner(numberOfHours);

    }

    public void lecture(Learner[] learners, double numberOfHours) {
//        numberOfHoursPerLearner=numberOfHours/learners.length;

        for (Learner i : learners) {
            i.learner(numberOfHours / learners.length);
        }
    }
    public double getNumberOfHoursPerLearner(){
        return numberOfHoursPerLearner;
    }


}
