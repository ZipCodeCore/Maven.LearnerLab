package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(25L);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(30L);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
//        Create a testTeach method that ensures when an Instructor invokes the teach method, a respective
//        student's totalStudyTime instance variable is incremented by the specified numberOfHours.
        Teacher teacher = new Instructor(30L);
        double hoursTeaching = 5;

        //When
        Student student = new Student(10L);
        teacher.teach(student, hoursTeaching);
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(hoursTeaching, actual, 0.001);

    }

    @Test
    public void testLecture(){
        Teacher teacher = new Instructor(1L);
        Student student = new Student(2L);
        Student student1 = new Student(3L);
        Student student2 = new Student(4L);

        Student[] studentArray = new Student[]{student, student1, student2};

        double numberOfHours = 15;
        double expected = 5;

        //When
        teacher.lecture(studentArray, numberOfHours);

        for(Student s : studentArray){
            double actual = student.getTotalStudyTime();
            Assert.assertEquals(expected, actual, 0);
        }

    }

}