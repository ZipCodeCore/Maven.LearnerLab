package io.zipcoder.interfaces;

public enum Educator implements ITeacher {

    Nhu(30),
    Leon(40),
    Tariq(60);

    private final Instructor instructor;
    private double timeWorked = 0;

    Educator(long id) {
        this.instructor = new Instructor(id);
        Instructors.getINSTANCE().personList.add(this.instructor);
    }
    Educator(Instructor instructor, double timeWorked) {
        this.instructor = instructor;
        this.timeWorked = timeWorked;
    }

    public void teach(ILearner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(ILearner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(double timeWorked) {
        this.timeWorked = timeWorked;
    }

    public Instructor getInstructor() {
        return instructor;
    }
}


/**
 * Part 11.1 - Create Educator enum
 * Create an enum named Educator.
 * The enum should implement Teacher.
 * The enum should have an enumeration for each of the instructors represented in the Instructors class.
 * Upon construction each enumeration of the enum should instantiate a respective Instructor and
 * assign it to a final instructor field upon construction.
 * The instructor should be added to the Instructors singleton.
 * Calls to the teach and lecture method should be differed to the composite instructor reference.
 * The enum should have a double timeWorked field which keeps track of the hours that the Educator has taught.
 */

