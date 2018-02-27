package io.zipcoder.interfaces;

public final class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        Student[] studentArray = new Student[Students.getInstance().getArray().length];
        for (int i =0; i<studentArray.length; i++){
            studentArray[i] = (Student) Students.getInstance().getArray()[i];
        }
        teacher.lecture(studentArray, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = (Instructor) Instructors.getInstance().findById(id);
        Student[] studentArray = new Student[Students.getInstance().getArray().length];
        for (int i =0; i<studentArray.length; i++){
            studentArray[i] = (Student) Students.getInstance().getArray()[i];
        }
        instructor.lecture(studentArray, numberOfHours);
    }
}
