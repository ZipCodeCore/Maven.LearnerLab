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


public class ZipCodeWilmington extends People {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();


    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }


    public void hostLecture(Teacher teacher, double numberOfHours) {
        Student[] listOfStudents = students.getStudentsArray();
        teacher.lecture(listOfStudents, numberOfHours);
    }


    public void hostLecture(long id, double numberOfHours) {
        hostLecture((Instructor) instructors.findByID(id), numberOfHours);


//        Instructor lectureInstructor = (Instructor) instructors.findByID(id);
//        lectureInstructor.lecture((Learner[]) students.getArray(), numberOfHours);
    }

}
