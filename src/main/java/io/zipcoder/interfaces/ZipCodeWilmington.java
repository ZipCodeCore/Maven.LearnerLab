package io.zipcoder.interfaces;

public final class ZipCodeWilmington {


    private static ZipCodeWilmington INSTANCE;
    public static Students students = Students.getInstance();
    public static Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {
    }

    public static ZipCodeWilmington getInstance() {
        if (INSTANCE == null){
            INSTANCE = new ZipCodeWilmington();
        }
        return INSTANCE;
    }

    public static void hostLectureByTeacher(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public static void hostLectureById(long id, double numberOfHours){
        Instructor lectureInstructor =  instructors.findById(id);
        lectureInstructor.lecture(students.getArray(), numberOfHours);
    }

}
