package App;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InstructorTest {

    Instructor tester;
    Student student1;
    Student student2;

    @Before
    public void setup() {
        tester = new Instructor(1005);
        student1 = new Student(1006);
        student2 = new Student(1007);
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(tester instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        Assert.assertTrue(tester instanceof Person);
    }

    @Test
    public void teachTest() {
        tester.teach(student1, 10);
        double expected = 10;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .001);
    }

    @Test
    public void lectureTest() {
        Learner[] learners = new Learner[2];
        learners[0] = student1;
        learners[1] = student2;
        tester.lecture(learners, 10);

        double expected = 5;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .001);
    }
}
