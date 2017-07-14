package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;


public class TestStudentTest {

    @Test

    public void testImplementation() {
        Person Jade = new Student("Jade");
        Student student = new Student("Jade");
        Assert.assertTrue(Jade instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student("Jade");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testLearn() {
        Student student = new Student("Jade");
        student.learn(15);

        double expected = 15;
        double actual = student.getTotalStudyTime();

    }
}