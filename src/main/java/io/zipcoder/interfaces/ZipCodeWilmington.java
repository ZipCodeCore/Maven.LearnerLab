package io.zipcoder.interfaces;

public final class ZipCodeWilmington {
    private static final ZipCodeWilmington ZIP_CODE_WILMINGTON = new ZipCodeWilmington();
    private Students students;
    private Instructors instructors;

    private ZipCodeWilmington() {
        this.instructors = Instructors.getInstance();
        this.students = Students.getInstance();
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture((Learner[]) Students.getInstance().getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor inst = (Instructor) instructors.findById(id);
        inst.lecture((Learner[]) Students.getInstance().getArray(), numberOfHours);
    }

    public static ZipCodeWilmington getInstance() {
        return ZIP_CODE_WILMINGTON;
    }
}
