package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();


    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(convertStudentsToLearnerArray(students), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = Instructors.getInstance().findById(id);
        teacher.lecture(convertStudentsToLearnerArray(students), numberOfHours);
    }

    public Learner[] convertStudentsToLearnerArray(Students originalStudents) {
        Learner[] learnerArray = new Learner[originalStudents.getPersonList().size()];
        for (int i = 0; i < learnerArray.length; i++) {
            learnerArray[i] = originalStudents.getPersonList().get(i);
        }
        return learnerArray;
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

}
