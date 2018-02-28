package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void ImplementationTest(){
        //Given
        Instructor instructorTest = new Instructor(2398474L);

        //When
        Class expected = Teacher.class;
        Class actual = instructorTest.getClass().getInterfaces()[0];

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void InheritanceTest(){
        //Given
        Instructor instructorTest = new Instructor(2398474L);

        //When
        Class expected = Person.class;
        Class actual = instructorTest.getClass().getSuperclass();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TeachTest(){
        //Given
        Instructor instructorTest = new Instructor(2398474L);
        Student studentTest = new Student(666666L);

        //When
        instructorTest.teach(studentTest, 30.5);

        double expected = 30.5;
        double actual = studentTest.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, .5);
    }

    @Test
    public void LectureTest(){
        //Given
        Instructor instructorTest = new Instructor(2398474L);
        Student studentTest = new Student(666666L);
        Student studentTest2 = new Student(555555L);
        Student studentTest3 = new Student(444444L);
        Student[] students = {studentTest, studentTest2, studentTest3};

        //When
        instructorTest.lecture(students, 6);

        double expected = 2;
        double actual = studentTest.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, .5);
    }

}
