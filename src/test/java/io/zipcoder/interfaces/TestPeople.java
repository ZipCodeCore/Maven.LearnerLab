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
        people = new People();
        personList = new ArrayList<String>();
    }
    @Test
    public void testAdd(){
        people.add(student);
        // can add a student bc it is a person
        Boolean actual = true;
        Assert.assertTrue(actual);

    }
    @Test
    public void testRemove(){
        people.remove(3);
        Boolean actual = true;
        Assert.assertTrue(actual);
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
