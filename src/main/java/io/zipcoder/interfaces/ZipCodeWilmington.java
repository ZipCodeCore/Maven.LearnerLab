package io.zipcoder.interfaces;

public final class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(Students.getInstance().getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = Instructors.getInstance().findById(id);
        instructor.lecture(Students.getInstance().getArray(), numberOfHours);
    }
}
