package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {

    Instructor instructorTest;
    @Before
    public void setUp() {
        instructorTest = new Instructor(1);
    }

    @Test
    public void testImplementation() {
        //Given
        boolean expected = true;

        //When
        boolean actual = instructorTest instanceof Instructor;

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testInheritance() {
        //Given
        boolean expected = true;

        //When
        boolean actual = instructorTest instanceof Person;

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTeach() {
        //Given
        double expected = 14;
        //student has the attributes of Learner
        Student tester = new Student(1);

        //When
        instructorTest.teach(tester, 14);
        double actual = tester.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture() {
        //Given
        Learner learners = new Student(1);
         double expected = 14;

        //When
        instructorTest.teach(learners, 14);

        //Then

        //aren't we supposed to test the lecture method?

    }

}
