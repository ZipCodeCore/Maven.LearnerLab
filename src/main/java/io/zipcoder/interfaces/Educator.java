package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    Kazuo_Ishiguro(0.0), Michael_Rosbash(0.0), Barry_Barish(0.0)
    ;
    double timeWorked;
    Instructor instructor;

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.getTimeWorked();

        instructor.teach(learner, numberOfHours);
    }
    @Override
    public void lecture(Person[] learners, double numberOfHours) {
        this.getTimeWorked();
        instructor.lecture(learners, numberOfHours);
    }

    Educator(double timeWorked) {
        this.timeWorked = timeWorked;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void timeWorked(){
        double numberOfHoursPerLearner = numberOfHours / .length;
        for (int i = 0; i < learners.length; i++){
            learners[i].learn(numberOfHoursPerLearner);
        }
    }
}
