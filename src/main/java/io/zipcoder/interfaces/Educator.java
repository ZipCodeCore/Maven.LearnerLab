package io.zipcoder.interfaces;

public enum Educator implements Teacher
{
    TARIQ("Tariq", 1),
    KRIS("Kris", 2),
    NHU("Nhu", 3),
    LEON("Leon", 4),
    FROILAN("Froilan", 5),
    WILHEM("Wilhem", 6);

    private final Instructor instructor;
    double hours = 0;

    //Using the enum to instantiate an Instructor
    //Then, get an instance of the Instructors singleton
    Educator(String name, long id)
    {
        this.instructor = new Instructor(name, id);
        Instructors instructors = Instructors.getInstance();
        instructors.add(this.instructor);
    }


    /*
    * "Call to the teach and lecture method should be differed to the composite
    * instructor reference"
    */

    public void teach(Learner learner, double numberOfHours)
    {
        instructor.teach(learner, numberOfHours);
        this.hours+=numberOfHours;

    }

    //takes in an array of students
    public void lecture(Learner[] learners, double numberOfHours)
    {
        instructor.lecture(learners, numberOfHours);
        this.hours+=numberOfHours;

    }






}
