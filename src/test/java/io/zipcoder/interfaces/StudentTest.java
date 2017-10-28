package io.zipcoder.interfaces;

//Part 3.0 - Test Student
//
//        Create a TestStudent class.
//        Create a testImplementation method that asserts that a Student is an instanceof a Learner.
//        Create a testInheritance method that asserts that a Student is an instanceof a Person.
//        Create a testLearn method that ensures a Student's totalStudyTime instance variable is incremented by the
//        specified numberOfHours by invoking the .learn method.
//

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testInheritance(){

        Student student = new Student(1234);

        boolean actual = (student instanceof Learner);

        Assert.assertTrue(actual);

    }


    @Test
    public void testImplementation(){

        Student student = new Student(1234);

        boolean actual = (student instanceof Person);

        Assert.assertTrue(actual);

    }

    @Test
    public void testlearn(){

        Student student = new Student(1221);
        Double expected = 10000.0;

        student.learn(10000.0);
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

}
