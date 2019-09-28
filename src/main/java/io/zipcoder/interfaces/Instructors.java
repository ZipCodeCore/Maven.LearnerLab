package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        super();

        Instructor aInstructor = new Instructor("Nhu", 500);
        this.add(aInstructor);
        Instructor bInstructor = new Instructor("Leon", 501);
        this.add(bInstructor);
        Instructor cInstructor = new Instructor("Tariq", 502);
        this.add(cInstructor);
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }

    //Override Instructor extends People, when a class extends another class you may override the methods in the parent
    //class unless they are made final.
    @Override
    public Instructor[] getArray() {
        return personList.toArray(new Instructor[0]);
    }

}


/**
 * Part 10.2 - Modify People subclasses
 * <p>
 * Modify the Students class signature to ensure that it is a subclass of People of parameterized type Student.
 * Modify the Instructors class signature to ensure that it is a subclass of People of parameterized type Instructor.
 * Provide concrete implementations of the getArray method in each of these classes.
 */
//hack to make code work prior to using gemerics
/** @Override public Instructor findById(long id) {
return (Instructor)super.findById(id);
}*/