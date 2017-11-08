package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    TARIQ,
    LEON,
    DOLIO;

    private double timeworked;
    private final Instructor instructor;

    Educator(){
        Instructors instructors = Instructors.getINSTANCE();
        Instructor instructor = new Instructor(instructors.getCount(), this.name()){
            @Override
            public void teach(Learner learner, double hoursTaught){
                super.teach(learner, hoursTaught);
                Educator.this.timeworked += hoursTaught;
            }

        };
        instructors.addPerson(instructor);
        this.instructor = instructor;
    }


    public Instructor getInstructor() {
        return instructor;
    }

    public double getTimeworked() {
        return timeworked;
    }

    @Override
    public void teach(Learner learner, double hours){
        instructor.teach(learner, hours);
    }

    @Override
    public void lecture(Learner[] learners, double hours){
        instructor.lecture(learners, hours);
    }

}

