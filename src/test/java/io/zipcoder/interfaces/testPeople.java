package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testPeople {
    Students students;
    Student aStudent;

    @Before
    public void setUp() {
        students = Students.getInstance();
        aStudent = new Student(100, "Brian");
    }

    @After
    public void tearDown() {
        students.remove(aStudent);
    }

    @Test
    public void testAdd() {
        students.add(aStudent);
        int expectedSize = 25;
        int actualSize = students.getCount();
        Assert.assertEquals(expectedSize,actualSize);
    }

    @Test
    public void testRemove() {
        System.out.println(students.getCount());
        students.add(aStudent);
        students.remove(aStudent);
        int expectedSize = 24;
        int actualSize = students.getCount();
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testFindById() {
        students.add(aStudent);
        String expected = "Brian";
        String actual = students.findById(100).getName();
        Assert.assertEquals(expected, actual);
    }
}
