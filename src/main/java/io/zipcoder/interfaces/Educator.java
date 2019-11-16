package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    KRIS(1, "Kris"), CHRIS(9, "Chris"), FROILAN(10, "Froilan"), DOLIO(11, "Dolio"), ROBERTO(6, "Roberto");

    private long id;
    private String name;
    private double timeWorked;

    Educator(long id, String name) {
        this.id = id;
        this.name = name;
        //Instructors.getInstance().add(new Instructor(this.id, this.name));
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        Instructors.getInstance().findById(this.id).teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        Instructors.getInstance().findById(this.id).lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }

}
