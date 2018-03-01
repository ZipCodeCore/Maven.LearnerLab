package io.zipcoder.interfaces;

import Interfaces.Learner;
import Interfaces.Teacher;

public enum Educator implements Teacher {
    TARIQ(2000), LEON(2001), FROILAN(2002), WILHEM(2003), KRIS(2004), NHU(2005);

    private final long id;
    double timeWorked;

    Educator(long id){
        this.id = id;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        timeWorked += numberOfHours;
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked += numberOfHours;
        double numberOfHoursPerLearner = numberOfHours/learners.length;
        for(Learner learner : learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }

    public double getTimeWorked(){
        return timeWorked;
    }
}
