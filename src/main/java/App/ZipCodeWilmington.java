package App;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public final class ZipCodeWilmington {

    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();


    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    private ZipCodeWilmington() {
    }

    private void hostLecture(Educator educator, double numberOfHours){
        Teacher teacher = educator;
        teacher.lecture(students.getArray(), numberOfHours);
    }

    private void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

    protected void hostLecture(long id, double numberOfNumbers) {
        Instructor teach = instructors.findById(id);
        hostLecture(teach, numberOfNumbers);
    }
}
