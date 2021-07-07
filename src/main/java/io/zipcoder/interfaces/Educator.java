package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    TARIQ("Tariq",1),
    KRIS("Kris",2),
    LEON("Leon",3),
    FROILAN("Froilan",4),
    NU("Nu",5),
    WILHEM("Wilhem",6);

    private final Instructor instructor;
    double workHours =0;

    Educator(String name,long id) {
        this.instructor = new Instructor(name,id);
        Instructors instructors = Instructors.getInstance();
        instructors.add(this.instructor);

    }



        public void teach(Learner learner, double numberOfHours) {
         instructor.teach(learner,numberOfHours);
         this.workHours+=numberOfHours;

        }

        public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
        this.workHours+=numberOfHours;


        }

}
