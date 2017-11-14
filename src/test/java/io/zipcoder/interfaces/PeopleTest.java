package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {
    Student aPerson;
    Students students;

    @Before
    public void setUp(){
        aPerson = new Student("Andrew",1);
        students = Students.getInstance();
    }

    @After
        public void breakDown(){
        students.remove(aPerson);

    }

    @Test
    public void testAdd() {
        String expected = "Andrew";
        students.add(aPerson);
        String actual = students.getPersonList().get(students.getCount()-1).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove_InputPerson() {
        students.add(aPerson);
        int expected = 26;
        students.remove(aPerson);
        int actual = students.getPersonList().size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindById() {
        students.getPersonList().add(aPerson);
        long expected = 1;
        long actual = students.findById(1).getId();
        Assert.assertEquals(expected,actual);
    }


}