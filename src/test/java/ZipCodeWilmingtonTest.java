import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLectureId(){
        Student student = (Student)Students.getInstance().getArray()[0];
        double before = 0;
        ZipCodeWilmington.getInstance().hostLecture(0, 20);
        double after= student.getTotalStudyTime();
        double expected = after - before;
        double actual = after;
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testHostLectureTeacher(){
        Student student = (Student) Students.getInstance().getArray()[0];
        double before = 0;
        Instructor tariq = (Instructor) Instructors.getInstance().findById(0);
        ZipCodeWilmington.getInstance().hostLecture(tariq, 10);
        double after = student.getTotalStudyTime();
        double expected = after - before;
        double actual = after;
        Assert.assertEquals(expected, actual, 0.01);
    }
}
