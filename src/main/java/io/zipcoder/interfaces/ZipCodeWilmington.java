package io.zipcoder.interfaces;

public final class ZipCodeWilmington{

    public static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    public static Students students = Students.getInstance();
    public static Instructors instructors = Instructors.getInstance();

    public ZipCodeWilmington() {

    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public static void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);

    }

    public static void hostLecture(long id, double numberOfHours) {
    Instructor specifiedInstructor =  (Instructor) instructors.findById(id);
        specifiedInstructor.lecture(students.getArray(), numberOfHours);

    }
}
