package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        Student[] studentArray = new Student[students.getCount()];

        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = (Student) students.findById(i);
        }

        teacher.lecture(studentArray, numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours) {
        Instructor instructor = (Instructor) instructors.findById(id);
        hostLecture(instructor, numberOfHours);
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }




}
