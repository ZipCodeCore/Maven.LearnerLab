package io.zipcoder.interfaces;

/*
        Java Singleton Pattern
 1-  Private constructor to restrict instantiation of the class from other classes.

 2-  Private static variable of the same class that is the only instance of the class.

 3-  Public static method that returns the instance of the class, this is the global access point
    for outer world to get the instance of the singleton class.
*/

// unextendable - all constructors made private
// final classes - cannot be extended or subclassed. prevents unwanted extensions
// Singleton - ensures that only 1 instance of the class exists in JVM

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors(); // singleton


    // nullary constructors - constructors that take no arguments
    private Instructors() {
        Instructor Tariq = new Instructor(1);
        Instructor Leon = new Instructor(2);
        Instructor Wilhem = new Instructor(3);
        Instructor Froilan = new Instructor(4);
        Instructor Chris = new Instructor(5);
        Instructor Nhu = new Instructor(6);

        personList.add(Tariq);
        personList.add(Leon);
        personList.add(Wilhem);
        personList.add(Froilan);
        personList.add(Chris);
        personList.add(Nhu);
    }

    public static Instructors getInstance() {
        return INSTANCE;

    }


    public Instructor[] getArray() {        // implemented from the changes made in people
        return new Instructor[0];
    }
}
