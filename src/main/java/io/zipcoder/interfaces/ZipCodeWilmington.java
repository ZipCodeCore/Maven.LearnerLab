package io.zipcoder.interfaces;


public final class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private Students students;
    private Instructors instructors;

    private ZipCodeWilmington() {
        this.students = Students.getInstance();
        this.instructors = Instructors.getInstance();
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture(students.getArray(), numberOfHours);

    }

    public void hostLecture(long id, double numberOfHours) {

        Instructor t = instructors.findByID(id);

        t.lecture(students.getArray(), numberOfHours);

    }


}
