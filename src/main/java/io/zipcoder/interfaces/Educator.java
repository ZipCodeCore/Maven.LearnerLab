package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    TARIQ("Tariq 'Too Many Cooks' Hook",1),
    LEON("Leon 'Wagwan' Hunter",2),
    YAS("Yas",3),
    DOLIO("L. Dolio Durant",4),
    MELANIE("Melanie",5)
    ;

    final Instructor instructor;
    double timeWorked;

    Educator(String name, long id) {
        this.instructor = new Instructor(name, id);
        Instructors.getInstance().add(this.instructor);
        this.timeWorked = 0;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners,numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return this.timeWorked;
    }
}
