package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    Instructor instructor;

    @Test
    public void implementationTest(){
        Instructor i = new Instructor();
        Assert.assertTrue(i instanceof Instructor);
    }
    @Test
    public void inheritanceTest(){
        Instructor i = new Instructor();
        Assert.assertTrue(i instanceof Person);
    }
    @Test
    public void constructorTest(){
        //Given
        long expectedId = -1;
        String expectedName = "James";
        //When
        Instructor instructor = new Instructor(expectedId, expectedName);
        long actualId = instructor.getId();
        String actualName = instructor.getName();
        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void teachTest(){
        //Given
        double expectedNumberOfHoursTaught = 3;
        Instructor instructor = new Instructor();
        Student student = new Student();
        //When
        instructor.teach(student, expectedNumberOfHoursTaught);
        double actualNumberOFHoursTaught = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expectedNumberOfHoursTaught, actualNumberOFHoursTaught, 0.5);

    }
    @Test
    public void lectureTest(){
        //Given
        double expectedNumberOfLectureHours = 5;
        Instructor instructor = new Instructor();
        Student student = new Student();


        //When
        instructor.lecture(new Student[]{student}, expectedNumberOfLectureHours);
        double actualNumberOfLectureHours = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expectedNumberOfLectureHours, actualNumberOfLectureHours,0.5);
    }
}
