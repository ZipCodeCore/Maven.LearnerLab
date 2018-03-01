package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    TARIQ(151),
    WILHEM(251),
    STEVE(351),
    FROILAN(451),
    NHU(551),
    LEON(651);

    final Instructor instructor;

    Educator(int Id) {
        instructor = new Instructor(Id);
    }

    double timeWorked;

    public void teach(Learner learner, double numberOfHours) {
        instructor.timeWorked += numberOfHours;
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numOfHoursEachLearner = numberOfHours/ learners.length;

        for (Learner learner : learners){
            learner.learn(numOfHoursEachLearner);

        }
        this.timeWorked += numberOfHours;
    }


    public double getTimeWorked(){
        return timeWorked;
    }
}

