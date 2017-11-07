package io.zipcoder.interfaces;

//Part 5.1 - Create Instructor Class
//
//        Create an Instructor class such that:
//        Instructor is a subclass of Person
//        Instructor implements the Teacher interface
//        Instructor should have a concrete implementation of the teach method which invokes the learn method on the
//                specified
//                Learner object.
//        Instructor should have a concrete implementation of the lecture method which invokes the learn method on each
//        of the elements in the specified array of Learner objects.
//        numberOfHours should be evenly split amongst the learners.
//        double numberOfHoursPerLearner = numberOfHours / learners.length;




public class Instructor extends Person implements Teacher {

    public Instructor(long id) {
        super(id);
    }

    public Instructor(long id, String name) {
        super(id, name);

    }
    public void teach(Student learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Student[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for (Learner currentElement : learners) {
            currentElement.learn(numberOfHoursPerLearner);
        }
    }

}


