package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void testImplementation() {
        Educator tariq = Educator.TARIQ;
        Assert.assertTrue(tariq instanceof Teacher);
    }

    @Test
    public void teachTest() {
        Educator leon = Educator.LEON;
        double initialTimeWorked = leon.getTimeWorked();
        Student testStudent = new Student(3, "hello");
        double expected = 20;
        leon.teach(testStudent, 20);
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
        Assert.assertEquals(initialTimeWorked+20, leon.getTimeWorked(), 0);
    }

    @Test
    public void lectureTest() {
        Educator leon = Educator.LEON;
        double initialTimeWorked = leon.getTimeWorked();
        Student testStudent = new Student(3, "hello");
        Student testStudent2 = new Student(4,"goodbye");

        Student[] studyGroup = {testStudent, testStudent2};

        double expected = 200;
        leon.lecture(studyGroup, 200);
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
        Assert.assertEquals(initialTimeWorked+200, leon.getTimeWorked(), 0);
    }
}
