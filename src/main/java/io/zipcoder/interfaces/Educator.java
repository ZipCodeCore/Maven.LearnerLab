package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    TARIQ(new Instructor(1,"Tariq Hook")),
    DOLIO(new Instructor(2,"Dolio Durant")),
    LEON(new Instructor(3,"Leon Hunter")),
    IYASU(new Instructor(4,"Iyasu, Watts")) ;


    private final Instructor instructor;
    Educator(Instructor teacher){
        this.instructor=teacher;
    }

    public Instructor getInstructor() {
        return instructor;
    }
    private double timeWorked=0;

    public double getTimeWorked() {
        return timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked+=numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {

        instructor.lecture(learners, numberOfHours);
        timeWorked+=numberOfHours;

         double numberOfHoursPerLearner = numberOfHours/learners.length;

        for(Learner eachLearner : learners){
            eachLearner.learn(numberOfHoursPerLearner);
        }
    }
}

