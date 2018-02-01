package io.zipcoder.interfaces;

public final class ZipCodeWilmington {

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();


    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor teacher = instructors.findById(id);
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }
}
