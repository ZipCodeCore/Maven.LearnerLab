import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLectureId(){
        Student student = Students.getInstance().getArray()[0];
        double before = 0;
        ZipCodeWilmington.getInstance().hostLecture(99999, 20);
        double after= student.getTotalStudyTime();
        double expected = after - before;
        double actual = after;
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testHostLectureTeacher(){
        Student student = Students.getInstance().getArray()[0];
        double before = 0;
        Instructor tariq = Instructors.getInstance().findById(99999);
        ZipCodeWilmington.getInstance().hostLecture(tariq, 10);
        double after = student.getTotalStudyTime();
        double expected = after - before;
        double actual = after;
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void testHostLectureEducator(){
        Student student = Students.getInstance().getArray()[0];
        double before = 0;
        ZipCodeWilmington.getInstance().hostLecture(Educator.TARIQ, 10);
        double after = student.getTotalStudyTime();
        double expected = after - before;
        double actual = after;
        Assert.assertEquals(expected, actual, 0.01);
    }
}
