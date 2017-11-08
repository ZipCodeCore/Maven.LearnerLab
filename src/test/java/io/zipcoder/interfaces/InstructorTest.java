package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {



    @Test
    public void Implementation()  {
        boolean instructorIsTeacher;

        Instructor newInstructor = new Instructor(123456789, "Steven");

        if(newInstructor instanceof Teacher){
            instructorIsTeacher = true;
        } else {
            instructorIsTeacher = false;
        }


        Assert.assertTrue(instructorIsTeacher);


    }

    @Test
    public void Inheritance()  {

        boolean instructorIsPerson;

        Instructor newInstructor = new Instructor(123456789, "Steven");

        if(newInstructor instanceof Teacher){
            instructorIsPerson = true;
        } else {
            instructorIsPerson = false;
        }


        Assert.assertTrue(instructorIsPerson);

    }

    @Test
    public void testTeach()  {
        Student student = new Student(234567891, "Gerrard");
        Instructor newInstructor = new Instructor(123456789, "Steven");
        newInstructor.teach(student,20);

        double expected = 30;
        double actual = student.getTotalStudyTime();


        Assert.assertEquals(expected,actual,0);


    }



    @Test
    public void testLecture()  {
        Student student = new Student(234567891, "Gerrard");
        Instructor newInstructor = new Instructor(123456789, "Steven");
        newInstructor.teach(student,20);

        double expected = 30;
        double actual = student.getTotalStudyTime();


        Assert.assertEquals(expected,actual,0);


    }



}
