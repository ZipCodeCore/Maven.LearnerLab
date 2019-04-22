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

public final class Students extends People<Student> {       // add <Student> to be parameterized type of Student


    private static final Students INSTANCE = new Students();

    // created so I could write hostLecture meth to avoid casting
    private Student[] studentsArray;


    // nullary constructors - constructors that take no arguments
    private Students() {
        Student Eric = new Student(1);
        Student Gio = new Student(2);
        Student Keith = new Student(3);

        personList.add(Eric);
        personList.add(Gio);
        personList.add(Keith);

        studentsArray = new Student[] {Eric, Gio, Keith};
    }


    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public Student[] getArray() {           // implemented from the changes made in people
        return new Student[0];
    }
}
