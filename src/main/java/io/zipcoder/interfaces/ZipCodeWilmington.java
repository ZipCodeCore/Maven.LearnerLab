package io.zipcoder.interfaces;

public final class ZipCodeWilmington {
    private static final ZipCodeWilmington ZIP_CODE_WILMINGTON = new ZipCodeWilmington();
    private Students students;
    private Instructors instructors;

    private ZipCodeWilmington() {
        this.instructors = Instructors.getInstance();
        this.students = Students.getInstance();
    }

    public void hostLecture(Educator educator, double numberOfHours) {
        educator.lecture(Students.getInstance().getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Educator educator = Educator.findById((int) id);
        educator.lecture(Students.getInstance().getArray(), numberOfHours);

//        Instructor instructor = (Instructor) Instructors.getInstance().findById(id);
//        instructor.lecture(Students.getInstance().getArray(), numberOfHours);
    }

    public static ZipCodeWilmington getInstance() {
        return ZIP_CODE_WILMINGTON;
    }
}
