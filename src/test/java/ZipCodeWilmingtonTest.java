import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLectureId(){
        Student student = Students.getInstance().getArray()[0];
        double before = 0;
        ZipCodeWilmington.getInstance().hostLecture(11111, 20);
        double after= student.getTotalStudyTime();
        double expected = after - before;
        double actual = after;
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testHostLectureTeacher(){
        Student student = Students.getInstance().getArray()[0];
        double before = 0;
        Instructor vince = Instructors.getInstance().findById(11111);
        ZipCodeWilmington.getInstance().hostLecture(vince, 10);
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
