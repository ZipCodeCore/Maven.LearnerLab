package io.zipcoder.interfaces;

public final class ZipCodeWilmington extends People {

    private  static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students;
    Instructors instructors;

    private ZipCodeWilmington() {
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;

    }
// to host a lecture to the composite people field in the students reference
    public static void hostLecture(Teacher teacher, double numberOfHours){

    }

    // identify a respective Instructor to host a lecture to the
    // composite people field in the cohort reference.
    public static void hostLecture (long id, double numberOfHours){

    }
}
