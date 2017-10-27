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
    ArrayList<Person> personList = new ArrayList<Person>();

    @Before
    public void setUp(){
        instructor = new Instructor("Uncle Bob", 1L);
        student1 = new Student("Uncle Bob", 1L);
        student2 = new Student("Uncle Bob", 1L);
        student3 = new Student("Uncle Bob", 1L);
        students = new Student[]{student1, student2, student3};
    }

    @Test
    public void testAdd(){
        personList.add(instructor);
        personList.add(student1);
        personList.add(student2);
        personList.add(student3);

        int expectedCount = 4;
        int actualCount = personList.size();

        Assert.assertEquals(expectedCount, actualCount);
    }

}
