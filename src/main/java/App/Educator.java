package App;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public enum Educator implements Teacher {

    Tariq(0),
    Leon(1),
    Wilhem(2),
    Kris(3),
    Nhu(4),
    Froilan(5);

    private final Instructor instructor;
    private double hoursWorked;

    Educator(long idValue){
        this.instructor = new Instructor(idValue);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        this.hoursWorked += numberOfHours;

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.hoursWorked += numberOfHours;
    }
}
