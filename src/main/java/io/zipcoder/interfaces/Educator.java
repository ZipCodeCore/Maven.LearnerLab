package io.zipcoder.interfaces;

public enum Educator implements  Teacher{

    TARIQ(new Instructor(1,"Tariq Hook")),
    DOLIO(new Instructor(2, "Dolio")),
    LEON(new Instructor(3, "Leon"));
    Instructor instructorObj;
//    Educator(int id,String name){
//        instructorObj = new Instructor(id,name)
//    }

//    public Instructor getInstructorObj() {
//        return instructorObj;
//    }
    private double timeWorked=0;

    public double getTimeWorked() {
        return timeWorked;
    }

    Educator(Instructor instructor) {
    }

    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
        timeWorked+=numberOfHours;
    }
    public  void lecture(Learner[] learnersArray,double numberOfHours){
        double noOfHoursPerLearner = numberOfHours/learnersArray.length;
        for (Learner learnerObj:learnersArray) {
            learnerObj.learn(noOfHoursPerLearner);

        }
        timeWorked+=numberOfHours;
    }
}
