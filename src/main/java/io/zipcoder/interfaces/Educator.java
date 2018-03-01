package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    TARIQ(1111),
    LEON(2222),
    KRIS(3333),
    FROILAN(4444),
    NHU(5555),
    WILLHELM(6666),
    DOLIO(7777);



    final Instructor instructor;

    double timeWorked = 0;



    Educator(long i) {
        this.instructor = new Instructor(i);
        Instructors.getInstance().personList.add(this.instructor);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double hoursToAdd = numberOfHours/ learners.length;
        for (int i = 0; i < learners.length; i++){
            learners[i].learn(hoursToAdd);
        }
        timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}


















