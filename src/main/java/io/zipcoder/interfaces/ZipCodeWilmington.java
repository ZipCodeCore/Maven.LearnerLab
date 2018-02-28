package io.zipcoder.interfaces;

public class ZipCodeWilmington extends People{

    public static Students students = new Students();
    public static Instructors instructors = new Instructors();

    public static void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);

    }
    public static void hostLecture(long id, double numberOfHours) {
        instructors.findById(id
    }


}
