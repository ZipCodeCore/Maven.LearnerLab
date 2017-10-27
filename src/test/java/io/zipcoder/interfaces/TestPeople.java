package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {

    Instructor instructor;
    Student student1;
    Student student2;
    Student student3;
    Student[] students;

    @Before
    public void setUp(){
        instructor = new Instructor("Uncle Bob", 1L);
        student1 = new Student("Uncle Bob", 2L);
        student2 = new Student("Uncle Bob", 3L);
        student3 = new Student("Uncle Bob", 4L);
        People.add(instructor);
        People.add(student1);
        People.add(student2);
        People.add(student3);
    }

    @Test
    public void testAdd(){
        int expectedCount = 4;
        int actualCount = People.getCount();
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testRemove(){
        int fullCount = People.getCount();

        People.remove(2L);
        People.remove(instructor);

        int halfCount = People.getCount();

        int expectedCount = 2;
        int diffCount = fullCount - halfCount;

        Assert.assertEquals(expectedCount, diffCount);
    }

    @Test
    public void testFindById(){
        Assert.assertEquals(student3, People.findById(4));
    }

}
