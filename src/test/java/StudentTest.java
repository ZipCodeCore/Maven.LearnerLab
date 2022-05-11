import io.zipcoder.interfaces.Learner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    Student testStudent;

    @Before
    public void setUp(){
        testStudent = new Student(777);
    }

    @Test
    public void testGetId(){
        long expected = 777;
        long actual = testStudent.getId();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testImplementation(){
        Assert.assertTrue(testStudent instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Assert.assertTrue(testStudent instanceof Student);
    }
    @Test
    public void testLearn(){
        double expected = 10.5f;
        testStudent.learn(10.5f);
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.01);
    }
}
