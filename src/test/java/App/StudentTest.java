package App;

import io.zipcoder.interfaces.Learner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    Student tester;

    @Before
    public void setup() {
        tester = new Student(1555);
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(tester instanceof Person);
    }

    @Test
    public void inheritanceTest() {
        Assert.assertTrue(tester instanceof Learner);
    }

    @Test
    public void getIdTest() {
        long expected = 1555;
        long actual = tester.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void learnTest() {
        tester.learn(10);
        double expected = 10;
        double actual = tester.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .001);
    }
}
