package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    private Students students = Students.getInstance();

    @Test
    public void testSingleton(){
        String expected = "Carolynn";
        String actual = students.findById(102).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetArray(){
        Student[] act = students.getArray();
        String actual = students.toString(act);
        String expected = "Anthony April Carolynn Daniel Frankie Jess Joe Luis ";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAdd(){
        students.add(new Student(200, "Adam"));
        Student[] a = students.getArray();
        String actual = students.toString(a);
        String expected = "Anthony April Carolynn Daniel Frankie Jess Joe Luis Adam ";
        Assert.assertEquals(actual, expected);
    }

    //methods in abstract parent class

    @Test
    public void testRemove(){


    }

    @Test
    public void testRemove2(){

    }

    @Test
    public void testRemoveAll(){

    }

    @Test
    public void testGetCount(){

    }
}
