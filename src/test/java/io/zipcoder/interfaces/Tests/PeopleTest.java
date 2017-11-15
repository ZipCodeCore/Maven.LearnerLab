package io.zipcoder.interfaces.Tests;

import io.zipcoder.interfaces.classes.People;

import io.zipcoder.interfaces.classes.Person;
import io.zipcoder.interfaces.classes.Student;
import io.zipcoder.interfaces.classes.Students;
import org.junit.Assert;
import org.junit.Test;


public class PeopleTest {


    Student student = new Student(99, "Zachary");
    Students students = Students.getINSTANCE();


    @Test
    public void testAdd() {

        students.add(student);


        String expected = "Zachary";
        String actual = students.findById(99).getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {

        int expected = 27;
        students.add(student); //student # 28
        students.remove(student);

        int actual = students.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {

        long expected = 99;
        students.add(student);
        long actual = students.findById(99).getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCount() {
        int expected = 27;
        int actual = students.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveAll() {
        int expected = 0;
        students.removeAll();
        int actual = students.getCount();
        Assert.assertEquals(expected, actual);
    }


}
