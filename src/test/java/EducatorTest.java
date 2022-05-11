import io.zipcoder.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void testImplementation(){
        Assert.assertTrue(Educator.TARIQ instanceof Teacher);
    }
    @Test
    public void testAdd(){
        Educator educator = Educator.TARIQ;
        int expected = 5;
        int actual = Instructors.getInstance().getCount();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTeach(){
        Student guy = new Student(19);
        Educator.TARIQ.teach(guy, 10);
        double expected = 10;
        double actual = guy.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void testLecture(){
        Student[] students = new Student[2];
        Student guy = new Student(12);
        Student guy2 = new Student(11);
        students[0] = guy;
        students[1] = guy2;
        Educator.TARIQ.lecture(students, 10);
        double expected = 5;
        double actual = guy.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void testGetTimeWorked(){
        Student[] students = new Student[2];
        Student guy = new Student(12);
        Student guy2 = new Student(11);
        students[0] = guy;
        students[1] = guy2;
        Educator.TARIQ.lecture(students, 10);
        double actual = Educator.TARIQ.getTimeWorked();
        double expected = 10;
        Assert.assertEquals(expected, actual, 0.01);

    }
}
