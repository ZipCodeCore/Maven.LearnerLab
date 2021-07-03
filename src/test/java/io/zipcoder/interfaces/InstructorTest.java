package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void implementationTest(){
        //Given
        Instructor smellyPeter = new Instructor(68);

        //When
        Class expected = Teacher.class;
        Class actual = smellyPeter.getClass().getInterfaces()[0];

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void inheritanceTest(){
        //Given
        Instructor smellyPeter = new Instructor(68);

        //When
        Class expected = Person.class;
        Class actual = smellyPeter.getClass().getSuperclass();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void teachTest(){
        //Given
        Instructor smellyPeter = new Instructor(68);
        Student stinkyPete = new Student(69);

        //When
        smellyPeter.teach(stinkyPete, 100);
        double expected = 100;
        double actual = stinkyPete.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual,0.01);

    }

    @Test
    public void lectureTest(){
        //Given
        Instructor smellyPeter = new Instructor(68);
        Student[] students = {new Student(69), new Student(54)};

        //When
        smellyPeter.lecture(students,100);
        double expected = 50;
        double actual1 = students[0].getTotalStudyTime();
        double actual2 = students[1].getTotalStudyTime();

        //Then
        Assert.assertTrue(expected == actual1 && expected == actual2);
    }

}
