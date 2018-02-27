package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementationTest(){
        //Given
        Instructor rancidRalph = new Instructor(88);

        //When
        Class expected = Teacher.class;
        Class actual = rancidRalph.getClass().getInterfaces()[0];

        //Then
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void personStudentTest() {
        Instructor rancidRalph = new Instructor(66);
        Assert.assertTrue(rancidRalph instanceof Teacher);

    }

    @Test
    public void testInheritanceTest(){
        //Given
        Instructor rancidRalph = new Instructor(88);

        //When
        Class expected = Person.class;
        Class actual = rancidRalph.getClass().getSuperclass();

        //Then
        Assert.assertEquals(actual,expected);

}

    @Test
    public void testTeach(){
        //Given
        Instructor rancidRalph = new Instructor(88);
        Student badDan = new Student(1);

        //when
        rancidRalph.teach(badDan, 125);
        double expected = 125;
        double actual = badDan.getTotalStudyTime();

        //Then
        Assert.assertEquals(actual,expected,.01);

    }

    @Test
    public void testLecture(){
        Instructor rancidRalph = new Instructor(88);
        Student[] students = {new Student(55), new Student(76)};

        //When
        rancidRalph.lecture(students, 100);
        double expected = 50;
        double actual1 = students[0].getTotalStudyTime();
        double actual2 = students[1].getTotalStudyTime();

        //Then
        Assert.assertTrue(expected == actual1 && expected == actual2);


    }

}