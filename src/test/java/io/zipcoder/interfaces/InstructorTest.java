package io.zipcoder.interfaces;

import Interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {
    Instructor instructorTest = new Instructor("Sue", 3);
    Student studentTest = new Student("Sally",3);
    @Test
    public void implementationTest(){
        Assert.assertTrue(instructorTest instanceof Teacher);
    }

    @Test
    public void inheritanceTest(){
        Assert.assertTrue(instructorTest instanceof Person);
    }

    @Test
    public void teachTest(){
        //Given
        double expected = 15;
        //When
        instructorTest.teach(studentTest, 15);
        double actual = studentTest.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void lectureTest(){
        //Given
        Student student1 = new Student("Sue", 6);
        Student student2 = new Student("Sally", 9);
        Student[] studentListTest = new Student[2];
        studentListTest[0] = student1;
        studentListTest[1] = student2;
        double expected = 70.00;
        //When
        instructorTest.lecture(studentListTest, 140);
        double actual =  student1.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, 0);
    }
}
