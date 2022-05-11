import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public class ZipCodeWilmington  {
    private static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private  Students students = Students.getInstance();
    private  Instructors instructors = Instructors.getInstance();



    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }
    public void hostLecture(long id, double numberOfHours){
        Instructor lectureInstructor = instructors.findById(id);
        lectureInstructor.lecture(students.getArray(), numberOfHours);
    }
    public void hostLecture(Educator educator, double numberOfHours){
        educator.lecture(students.getArray(), numberOfHours);
    }
}
