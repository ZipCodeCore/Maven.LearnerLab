import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLectureId(){
    ZipCodeWilmington.getInstance().hostLecture(0, 20);
    double expected = 2;
    Student student = (Student)Students.getInstance().getArray()[0];
    double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testHostLectureTeacher(){
    Instructor Tariq = (Instructor) Instructors.getInstance().findById(0);
    ZipCodeWilmington.getInstance().hostLecture(Tariq, 10);
    double expected = 1;
    Student student = (Student) Students.getInstance().getArray()[1];
    double actual = student.getTotalStudyTime();
    Assert.assertEquals(expected, actual, 0.01);
    }
}
