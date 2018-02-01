package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    TARIQHOOK (0, "Tariq Hook"),
    IYASUWATTS (1, "Iyasu Watts"),
    DOLIODURANT (2, "L. Dolio Durant"),
    LEONHUNTER (3, "Leon Hunter"),
    FROILANMIRANDA (4, "Froilan Miranda");

    private final Instructor instructor;

    private double timeWorked =0;

    Educator(int id, String name){
        instructor=new Instructor(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
                learner.learn(numberOfHours);
                this.timeWorked +=numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerStudent = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerStudent);
        }
        this.timeWorked +=numberOfHours;
    }

    public double getTimeWorked(){
        return timeWorked;
    }

    public Instructor getInstructor(){
        return instructor;
    }




}
