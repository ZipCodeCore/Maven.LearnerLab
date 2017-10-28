package io.zipcoder.interfaces;

//Part 5.0 - Test Instructor
//
//        Create a TestInstructor class.
//        Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
//        Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
//        Create a testTeach method that ensures when an Instructor invokes the .teach method, a respective student's
//        totalStudyTime instance variable is incremented.
//        Create a testLecture method that ensures when an Instructor invokes the .teach method, a respective student's
//        totalStudyTime instance variable is incremented by the specified numberOfHours.

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(1234);

        boolean actual = instructor instanceof Teacher;

        Assert.assertTrue(actual);


    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(4321);

        boolean actual = instructor instanceof Person;
    }

    @Test
    public void testTeach(){
        Student student = new Student(9876);
        Instructor instructor = new Instructor(4567);
        double expected = 10.0;

        instructor.teach(student,10.0);
        double actual = student.getTotalStudyTime();

        Assert.assertTrue(expected==actual);

    }

    @Test
    public void testLecture(){
       Student[] students = {new Student(123), new Student(456)};


        Instructor instructor = new Instructor(4567);
        double expected = 25.0;

        instructor.lecture(students,50.0);
        double actual = students[0].getTotalStudyTime();

        Assert.assertTrue(expected==actual);

    }
}
