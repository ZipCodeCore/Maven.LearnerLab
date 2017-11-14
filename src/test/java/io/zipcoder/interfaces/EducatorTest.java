package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    Student student;

    @Before
    public void setUp() {
        student = new Student();
    }

    @After
    public void tearDown() {
        Educator.TARIQ_HOOK.timeworked = 0.0;
    }

    @Test
    public void addTimeWorked() throws Exception {
        Double expected = 10.0;
        Educator.TARIQ_HOOK.addTimeWorked(expected);
        Double actual = Educator.TARIQ_HOOK.getTimeworked();
        Assert.assertEquals(expected, actual, .001);
    }

    @Test
    public void teach() throws Exception {
        Educator.TARIQ_HOOK.teach(student, 10);
        double expectedStudyTimeOfStudent = 10;
        double actualStudyTimeOfStudent = student.getTotalStudyTime();
        Assert.assertEquals(expectedStudyTimeOfStudent, actualStudyTimeOfStudent, .001);
    }

    @Test
    public void lecture() throws Exception {
        Students students = Students.getInstance();
        Student[] studentsArray = students.getArray();
        Educator.TARIQ_HOOK.lecture(studentsArray, 24);
        double expected = 1;
        double actual = studentsArray[0].getTotalStudyTime();
        Assert.assertEquals(expected, actual, .001);
    }

}