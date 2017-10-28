package io.zipcoder.interfaces;

//Part 7.0 - Test Students singleton
//
//        Create a TestStudents class.
//        Create a test method which ensures that each of the students in your current cohort are in your Students
//        singleton.

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class StudentsTest {


    @Test
    public void StudentsINSTANCETest(){

    Students cohort = Students.getINSTANCE();

    String expected = "Some array";
    String actual = cohort.getArray();


    Assert.assertEquals(expected,actual);


    }
}
