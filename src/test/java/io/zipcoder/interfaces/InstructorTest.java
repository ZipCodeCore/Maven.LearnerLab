package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

/**
 * Create a TestInstructor class.
 * Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
 * Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
 * Create a testTeach method that ensures when an Instructor invokes the teach method, a respective
 * student's totalStudyTime instance variable is incremented by the specified numberOfHours.
 * Create a testLecture method that ensures when an Instructor invokes the lecture method, a
 * respective array of students' totalStudyTime instance variables is incremented by
 * numberOfHours/students.length.
 */

public class InstructorTest {

    @Test
    public void implementationTest(){
        Instructor instructor = new Instructor(0, "Mr.Teach");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest(){
        Instructor instructor = new Instructor(0, "Mr.Teach");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest(){
        Instructor instructor = new Instructor(0, "Mr.Teach");
        Student student = new Student();
        Double expected = 5.0;
        instructor.teach(student,expected);
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual );
    }

    @Test
    public void lectureTest(){
        Instructor instructor = new Instructor(0, "Mr.Teach");
        Student jake = new Student(0,"Jake");
        Student sue = new Student(1, "Sue");
        Student bob = new Student(2, "Bob");
        Student[] classroom = {jake, sue, bob};

        instructor.lecture(classroom,15.0);

        Double exp = 5.0;
        Double act1 = jake.getTotalStudyTime();
        Double act2 = sue.getTotalStudyTime();
        Double act3 = bob.getTotalStudyTime();

        Assert.assertEquals(exp,act1);
        Assert.assertEquals(exp,act2);
        Assert.assertEquals(exp,act3);
    }



}
