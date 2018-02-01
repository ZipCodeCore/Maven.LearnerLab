package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    Educator tariq = Educator.valueOf("Tariq");

    @Test
    public void testImplementation() {
        Assert.assertTrue(tariq instanceof Teacher);
    }

//    @Test // Educator only implements Teacher, not Person
//    public void testInheritance() {
//        Assert.assertTrue(tariq instanceof Person);
//    }

    @Test
    public void teach() throws Exception {
        Student student = new Student();

        tariq.teach(student, 5.0);

        double expected = 5.0;

        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0d);
    }

    @Test
    public void lecture() throws Exception {

        Student s1 = new Student();
        Student s2 = new Student();
        Learner[] learners = {s1, s2};

        tariq.lecture(learners, 100);
        double expected = 50.0;

        double actual = s1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0d);

    }

}