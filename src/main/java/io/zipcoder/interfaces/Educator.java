package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    Leon(1),
    Wilhem(2),
    Tariq(3),
    Nhu(4),
    ;

    final Instructor instructor;
    double timeWorked = 0;

    Educator(int i) {
        this.instructor = new Instructor(i);
        Instructors.getInstance().personList.add(this.instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner: learners) {
            learner.learn(numberOfHoursPerLearner);
        }
        this.timeWorked += timeWorked;
    }

    public double getTimeWorked(){
        return timeWorked;
    }
}
