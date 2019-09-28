package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testInstructorImplementation() {
        Instructor katrina = new Instructor("Katrina", 12234);
        Assert.assertTrue(katrina instanceof ITeacher);
    }
    @Test
    public void testInstructorInheritance() {
        Instructor katrina = new Instructor("Katrina", 12234);
        Assert.assertTrue(katrina instanceof Person);
    }
        @Test
    public void testInstructorTeach() {
        Student aStudent = new Student("katrina", 123, 200);
        Instructor aInstructor = new Instructor("Chris", 12);
        aInstructor.teach(aStudent, 100);
        double expected = 300.0;
        double actual = aStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual ,.01);
        //how much error you want due to double
    }

   @Test
    public void testInstructorLecture() {
        Instructor aInstructor = new Instructor("Chris", 12);
        Student aStudent1 = new Student("Chris", 123, 50);
        Student aStudent2 = new Student("Lamar", 124, 0);
        Student[] students = {aStudent1, aStudent2};
        aInstructor.lecture(students, 100);
        double expected = 50.00;
        double actual = aStudent1.getTotalStudyTime();
        Assert.assertEquals(expected,actual ,.01);

    }
}

/**Part 5.0 - Test Instructor

        Create a TestInstructor class.
        Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
        Create a testInheritance method that asserts that a Instructor is an instanceof a Person.

        Create a testTeach method that ensures when an Instructor invokes the teach method, a
 respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
        Create a testLecture method that ensures when an Instructor invokes the lecture method, a
 respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.*/


