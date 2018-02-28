import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InstructorTest {

    Instructor testInstructor;
    Student testStudent1;
    Student testStudent2;


    @Before
    public void setUp(){
        testInstructor = new Instructor(1111);
        testStudent1 = new Student(222);
        testStudent2 = new Student(333);

    }

    @Test
    public void testImplementation(){
        Assert.assertTrue(testInstructor instanceof Teacher);
    }
    @Test
    public void testInheritance() {
        Assert.assertTrue(testInstructor instanceof Person);
    }
    @Test
    public void testTeach(){
        double expected = 10;
        testInstructor.teach(testStudent1, 10);
        double actual = testStudent1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void testLecture(){
        Learner[] learners = new Learner[2];
        learners[0] = testStudent1;
        learners[1] = testStudent2;
        testInstructor.lecture(learners, 10);
        double expected = 5;
        double actual = testStudent1.getTotalStudyTime();
    }
}
