package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {
    private People thePeople;
    private ArrayList<Person> personList;
    private Student theStudent1;
    private Instructor theInstructor1;

    @Before
    public void setUp() throws Exception {

        theStudent1 = new Student(1);
        theInstructor1 = new Instructor(2);
        personList = new ArrayList<Person>();
        personList.add(theStudent1);
        personList.add(theInstructor1);
        thePeople = new People(personList);
    }

    @Test
    public void addTrueTest() {
        Student theStudent2 = new Student(5);
        boolean expected = true;
        boolean actual = thePeople.add(theStudent2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addFalseTest() {
        boolean expected = false;
        boolean actual = thePeople.add(theStudent1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTrueTest() {
        boolean expected = true;
        boolean actual = thePeople.remove(theStudent1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeFalseTest() {
        Student theStudent3 = new Student(3);
        boolean expected = false;
        boolean actual = thePeople.remove(theStudent3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdFalseTest() {
        Student theStudent3 = new Student(3);
        boolean expected = false;
        boolean actual = thePeople.removeById(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {

        boolean expected = true;
        boolean actual = thePeople.removeById(1);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void findByIdTest() {

        Person expected = theStudent1;
        Person actual = thePeople.findById(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdNotFoundTest() {

        Person expected = null;
        Person actual = thePeople.findById(7);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearListTest(){
       thePeople.clearList();
        int expected = 0;
        int actual = thePeople.getCount();

        Assert.assertEquals(expected, actual);
    }
}