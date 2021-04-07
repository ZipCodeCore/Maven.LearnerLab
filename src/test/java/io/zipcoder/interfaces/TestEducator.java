package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation() {

        Assert.assertTrue(Educator.FROILAN instanceof Educator);
    }

    @Test
    public void testGetTimeWorked() {
        Student steve = new Student(03723);
        Educator.FROILAN.teach(steve, 10);
        double expected = 10;
        double actual = Educator.FROILAN.getTimeWorked();
        Assert.assertEquals(expected, actual, 0.05);
    }

    @Test
    public void testTeach() {
        Student student = new Student(7865241);
        double numberOfHours = 12.5;
        Educator.TARIQ.teach(student, numberOfHours);
        Educator.TARIQ.teach(student, 24);
        double expected = numberOfHours + 24;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.05);

    }

    @Test
    public void testLecture() {

        Student student = new Student(837324236);
        Student student1 = new Student(239847493);
        Student student2 = new Student(98374324);
        Student student3 = new Student(32984732);

        Learner[] learners = {student, student1, student2, student3};

        double numberOfHours = 12.5;
        Educator.LEON.lecture(learners, numberOfHours);
        double expected = numberOfHours / learners.length;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .05);
    }
}
