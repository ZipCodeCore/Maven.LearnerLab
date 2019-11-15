package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testEduImplementation() {
        Assert.assertTrue( Educator.KRIS instanceof Teacher);
    }




    @Test
    public void testTeach() {

        Student student = new Student(9, "Bob");

        Educator.KRIS.teach(student, 10);
        double actual = student.getTotalStudyTime();
        double expected = 10.0;
        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void testLecture() {
        Learner[] learners = new Learner[3];
        for (int i = 0; i < 3; i++) {
            learners[i] = new Student(i, "Brian" + i);
        }

        Educator.ROBERTO.lecture(learners, 9);
        double actual = learners[1].getTotalStudyTime();
        double expected = 3;
        Assert.assertEquals(expected, actual,0 );

    }
}

