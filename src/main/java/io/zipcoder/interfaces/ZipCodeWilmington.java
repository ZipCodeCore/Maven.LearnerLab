package io.zipcoder.interfaces;

public final class ZipCodeWilmington {

    private final static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private static Students students = Students.getInstance();

    private static Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture((Learner[]) students.getArray(), numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours) {

    }




}
