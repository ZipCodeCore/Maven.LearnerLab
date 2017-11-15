package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    Tariq(1, "Tariq"),
    Leon(2, "Leon"),
    Dolio(3, "Dolio");

    final Instructor instructor;
    double timeWorked;

    Educator(long id, String name){
        this.instructor = new Instructor(id, name);
        Instructors.getINSTANCE().add(instructor);
        this.timeWorked = 0;

    }

    public Double getTimeWorked() {
        return timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (int i = 0; i<learners.length; i++){
            learners[i].learn(numberOfHoursPerLearner);
        }this.timeWorked += numberOfHours;

    }

}
