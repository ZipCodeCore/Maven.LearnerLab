package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testEducatorImplementation() {
        Assert.assertTrue(Educator.Nhu instanceof ITeacher);
    }

    @Test
    public void testEducatorInheritance() {
        Assert.assertTrue(Educator.Nhu instanceof Educator);
    }

    @Test
    public void testEducatorTeach_StudentHours() {
        Student aStudent10 = new Student("katrina", 10);
        Educator.Nhu.teach(aStudent10, 5);
        double expected = 5;
        double actual = aStudent10.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.01);

    }
    @Test
    public void testEducatorTeach_TimeWorked() {
        Student aStudent10 = new Student("katrina", 200);
        Educator.Nhu.teach(aStudent10, 100);
        double expected = 300;
        double actual = Educator.Nhu.getTimeWorked();
        Assert.assertEquals(expected, actual, 0.01);

    }

    @Test
    public void testEducatorLecture() {
        Student aStudent1 = new Student("Chris", 123, 50);
        Student aStudent2 = new Student("Lamar", 124, 0);
        Student[] students = {aStudent1, aStudent2};
        Educator.Nhu.lecture(students, 100);
        double expected = 50;
        double actual = aStudent2.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0.00);
    }

}
/**
 * Test Educator use part 5 as reference
 * Part 5.0 - Test Instructor
 * <p>
 * Create a TestInstructor class.
 * Create a testImplementation method that asserts that anInstructor is an instanceof a Teacher.
 * Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
 * Create a testTeach method that ensures when an Instructor invokes the teach method, a
 * respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
 * Create a testLecture method that ensures when an Instructor invokes the lecture method,
 * a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
 */


