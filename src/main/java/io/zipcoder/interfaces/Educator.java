package io.zipcoder.interfaces;

public enum Educator implements Teacher {


        TARIQ (1, "Tariq"),
        LEON (2, "Leon"),
        DOLIO (3, "Dolio");

        private final Instructor instructor;
        private final Instructors INSTANCE = Instructors.getInstance();
        private double timeWorked = 0;



    Educator(long id, String name) {
                     this.instructor = new Instructor(id, name);

                    INSTANCE.add(instructor);
               }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
                timeWorked += numberOfHours;
                    instructor.teach(learner, numberOfHours);
               }

            public void lecture(Learner[] learners, double numberOfHours) {
                   timeWorked += numberOfHours;
                    instructor.lecture(learners, numberOfHours);
               }

        }


