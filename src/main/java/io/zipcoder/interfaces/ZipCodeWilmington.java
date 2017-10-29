package io.zipcoder.interfaces;

import java.util.Arrays;

public final class ZipCodeWilmington {

    private static Students students = Students.getInstance();
    private static Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington() {

    }

    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(Arrays.copyOf(students.getArray(), students.getCount(), Student[].class), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = (Instructor) instructors.findById(id);
        instructor.lecture(Arrays.copyOf(students.getArray(), students.getCount(), Student[].class), numberOfHours);
    }

    public static Students getStudents() {
        return students;
    }

    public static Instructors getInstructors() {
        return instructors;
    }
}
