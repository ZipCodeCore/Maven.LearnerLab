package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {

    People people;
    Instructor instructor;
    Student student;
    ArrayList<String> personList;

    @Before
    public void setUp() {
        student = new Student(1);
        instructor = new Instructor(2);
        people = Students.getInstance();
        personList = new ArrayList<String>();
    }
    @Test
    public void testAdd(){
        // can add a student bc it is a person
        Boolean actual = people.add(student);
        Assert.assertTrue(actual);

    }
    @Test
    public void testRemove(){
        people.remove(3);
        Assert.assertNull(people.findById(3));
    }
    @Test
    public void testFindById(){
        Person expected = instructor;
        //can use instructor as expected bc it is a person
        people.add(expected);
        Person actual = people.findById(expected.getId());
        Assert.assertEquals(expected, actual);
    }
}
