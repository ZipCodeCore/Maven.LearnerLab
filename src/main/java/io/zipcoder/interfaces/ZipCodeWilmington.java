package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public <T extends Teacher> void hostLecture(T teacher, double numberOfHours) {
        Student[] studentArray = new Student[students.getCount()];

        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = students.findById(i);
        }
        teacher.lecture(studentArray, numberOfHours);
    }

    public <T> void hostLecture(Long id, double numberOfHours) {
        Instructor instructor = instructors.findById(id);
        hostLecture(instructor, numberOfHours);
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }
}
