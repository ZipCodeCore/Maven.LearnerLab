package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    TARIQ(20),
    FROILAN(21),
    WILHEM(22),
    NHU(23),
    LEON(24);

    final Instructor instructor;

    Educator(int id) {
        instructor = new Instructor(id);
    }

    double timeWorked;

    public void teach(Learner learner, double numberOfHours) {
        instructor.timeWorked += numberOfHours;
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learner, double numberOfHours) {
        timeWorked += numberOfHours;
        double numberOfHoursPerLearner = numberOfHours / learner.length;

        for (int i = 0; i < learner.length; i++) {
            learner[i].learn(numberOfHoursPerLearner);
        }
    }

    public double getTimeWorked(){
        return timeWorked;
    }
}




