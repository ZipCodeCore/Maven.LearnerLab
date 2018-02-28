package io.zipcoder.interfaces;

public enum Educator implements Teacher {


    TARIQ(100),
    LEON(150),
    FROILAN(200);

    double timeWorked;
    final Instructor instructor;

    Educator(long ID){
       this.instructor =  new Instructor (ID);
       Instructors.getInstance().add(this.instructor);

    }

    public void teach(Learner learner, double numberOfHours) {
        this.timeWorked += numberOfHours;
        this.instructor.teach(learner,numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        this.timeWorked += numberOfHours;
        this.instructor.lecture(learners,numberOfHours);
    }
}
