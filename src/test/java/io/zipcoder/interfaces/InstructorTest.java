package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public class InstructorTest {
    private Instructor i;

    @Before
    public void setup() {
        i = new Instructor(9);
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(Teacher.class.isInstance(i));
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(Person.class.isInstance(i));
    }

    @Test
    public void testTeach() {
        Student s = new Student(10);
        double expected = 10000;
        i.teach(s, expected);
        double actual = s.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testLecture() {
        double expected = 5;
        Student s1 = new Student(0);
        Student s2 = new Student(1);
        Student s3 = new Student(2);

        Student[] students = {s1, s2, s3};

        i.lecture(students, (expected * students.length));

        Assert.assertEquals(expected, s1.getTotalStudyTime(), 0.01);
        Assert.assertEquals(expected, s2.getTotalStudyTime(), 0.01);
        Assert.assertEquals(expected, s3.getTotalStudyTime(), 0.01);
    }
}