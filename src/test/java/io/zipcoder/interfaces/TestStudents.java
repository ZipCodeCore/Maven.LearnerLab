package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStudents {

    @Test
    public void testSingleton(){
        Students students = Students.getInstance();
        String expected = "Carolynn";
        String actual = students.findById(102).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetArray(){
        Students students = Students.getInstance();
        Student[] act = students.getArray();
        String actual = students.studentArrayToString(act);
        String expected = "Anthony April Carolynn Daniel Frankie Jess Joe Luis ";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAdd(){
        Students students = Students.getInstance();
        students.add(new Student(200, "Adam"));
        Student[] a = students.getArray();
        String actual = students.studentArrayToString(a);
        String expected = "Anthony April Carolynn Daniel Frankie Jess Joe Luis Adam ";
        Assert.assertEquals(actual, expected);
    }
}
