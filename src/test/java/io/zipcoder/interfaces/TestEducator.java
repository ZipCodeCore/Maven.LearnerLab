package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void implementationTest() {
        boolean answer = Educator.TARIQ instanceof Educator;

        Assert.assertTrue(answer);
    }

    @Test
    public void teachTest() {
        Student student1 = new Student(10);
        Educator.LEON.teach(student1, 4);

        double expected = 4;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 1e-15);
    }

    @Test
    public void lectureTest() {
        Student student1 = new Student(12);
        Student student2 = new Student(13);

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
        Educator.KRIS.lecture(students, 10);

        double expected = 5;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 1e-15);
    }
}
