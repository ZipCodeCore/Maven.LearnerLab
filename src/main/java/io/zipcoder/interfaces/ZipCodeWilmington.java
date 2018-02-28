package io.zipcoder.interfaces;

final class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getINSTANCE();
    private static final Instructors instructors = Instructors.getINSTANCE();

    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }



    private ZipCodeWilmington() {
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture(students.getStudentArray(), numberOfHours);

    }

    public void hostLecture(long id, double numberOfHours) {

        Instructor teacher = (Instructor)instructors.findById(id);
        hostLecture(teacher, numberOfHours);

    }
}
