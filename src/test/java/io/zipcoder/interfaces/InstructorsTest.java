package io.zipcoder.interfaces;

//Part 7.0 - Test Students singleton
//
//        Create a TestStudents class.
//        Create a test method which ensures that each of the students in your current cohort are in your Students
//        singleton.

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class InstructorsTest {


    @Test
    public void InstructorsINSTANCETest(){

    Instructors cohort = Instructors.getINSTANCE();

    int expected =3;
    int actual = cohort.getArray().length;

     Assert.assertEquals(expected,actual);


    }
}
