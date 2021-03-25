package io.zipcoder.interfaces;

public class ZipCodeWilimington {
    private static final ZipCodeWilimington INSTANCE = new ZipCodeWilimington();

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilimington getInstance()
    {
        return INSTANCE;
    }

    private ZipCodeWilimington() {}

    //Teacher is the interface
    public void hostLecture(Teacher teacher, double numberOfHours)
    {
        teacher.lecture(students.getArrayOfStudents(),numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours)
    {
        //Initially used a findById method which returns type Person object but we need an instructor
        /*
        * Was
        *
        * Instructor instructor = (Instructor) instructors.findById(id);
        * */
        Instructor instructor = instructors.findById(id);

    }
}
