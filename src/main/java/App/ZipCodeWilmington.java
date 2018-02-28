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

    private static void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

    protected static void hostLecture(long id, double numberOfNumbers) {
        Instructor teach = (Instructor) instructors.findById(id);
        hostLecture(teach, numberOfNumbers);
    }
}
