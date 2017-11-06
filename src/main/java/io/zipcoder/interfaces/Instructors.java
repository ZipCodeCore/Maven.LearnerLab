package io.zipcoder.interfaces;

//Part 7.1 - Create Students singleton
//
//        Note: The creation of this class will demonstrate an implementation of singleton design pattern.
//        Create a Students class.
//        The class should be an unextendable subclass of the People class.
//        The class should statically instantiate a final field named INSTANCE of type Students.
//        The class should define a private nullary constructor which populates the INSTANCE field with respective
//        io.zipcoder.interfaces.Student representations of your colleagues.
//        Each student should have a relatively unique id field.
//        The class should define a getInstance method which returns the INSTANCE field.


public class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE;

    private Instructors(){

    }

    static {
        INSTANCE = new Instructors();
        Instructor tariq = new Instructor(123, Educator.TARIQ);
        Instructor leon = new Instructor(124, Educator.LEON);
        Instructor dolio = new Instructor(125, Educator.DOLIO);
        INSTANCE.addPerson(tariq);
        INSTANCE.addPerson(leon);
        INSTANCE.addPerson(dolio);
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }

    public Instructor[] getArray(){

        int personListSize = getPersonList().size();
        Instructor[] instructors = new Instructor[personListSize];

        for(int i=0; i<personListSize; i++) {
            instructors[i] = getPersonList().get(i);
        }
        return instructors;

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
