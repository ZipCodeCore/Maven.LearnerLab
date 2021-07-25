package io.zipcoder.interfaces;

public enum Educator implements  Teacher{
    LEON (new Instructor(76L, "Leon")),
    DOLIO (new Instructor(70L, "Dolio")),
    KRIS (new Instructor(72L, "Kris"));

    private final Instructor instructor;
    private double timeWorked;

    Educator(Instructor instructor){
        this.instructor = instructor;
        Instructors.getInstance().add(instructor);
    }

    public Instructor getInstructor(){
        return instructor;
     }

     public Double getTimeWorked(){
        return timeWorked;
     }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        this.timeWorked += numberOfHours;
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        this.timeWorked += numberOfHours;
        double hoursLearned = numberOfHours/ learners.length;
        for (Learner learner : learners) {
            learner.learn(hoursLearned);
        }
    }

}
