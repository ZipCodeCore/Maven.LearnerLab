package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    Student student;


    @Test
    public void implementationTest(){
        Student s = new Student();
        Assert.assertTrue(s instanceof Student);
    }
    @Test
    public void inheritanceTest(){
        Student s = new Student();
        Assert.assertTrue(s instanceof Person);
    }

    @Test
    public void constructorTestWithNameIdStudyTime() {
        //Given
        long expectedId = -1;
        String expectedName = "James";
        double expectedTotalStudyTime = 0;
        //When
        Student student = new Student(expectedId, expectedName, expectedTotalStudyTime);
        long actualId = student.getId();
        String actualName = student.getName();
        double actualTotalStudyTime = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, 0.5);
    }
    @Test
    public void getTotalStudyTimeTest(){
        //Given
        double expectedTotalStudyTime = 0;
        //When
        Student student = new Student(expectedTotalStudyTime);
        double actualTotalStudyTime = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, 0.5);
    }
    @Test
    public void learnTest(){
        //Given
        Student student = new Student();
        double expectedTotalStudyTime = 3;
        //When
        student.learn(expectedTotalStudyTime);
        double actualTotalStudyTime = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, 0.5);
    }

}
