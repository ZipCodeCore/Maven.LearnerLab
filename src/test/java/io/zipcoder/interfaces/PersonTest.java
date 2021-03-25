package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person testPerson;



    @Test
    public void getId() {
        Long expected = 32L;
        String name = "Joe";
        testPerson = new Person(expected,name);

        Long actual = testPerson.getId();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getName() {
        Long id = 32L;
        String expected = "Joe";
        testPerson = new Person(id,expected);

        String actual = testPerson.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setName() {
        Long id = 32L;
        String expected = "Joe";
        testPerson = new Person(id,"");

        testPerson.setName("Joe");
        String actual = testPerson.getName();

        Assert.assertEquals(expected,actual);
    }
}