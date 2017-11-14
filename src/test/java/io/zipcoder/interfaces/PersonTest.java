package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person newPerson = new Person(1);

    @Test
    public void testConstructor1() {
        Person newPerson = new Person(1);
        long expected = 1;
        long actual = newPerson.getId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSetName() {
        String expected = "Brian";
        newPerson.setName(expected);
        String actual = newPerson.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor2() {
        Person newPerson = new Person("Zack",1);
        String expected = "Zack";
        String actual = newPerson.getName();
        Assert.assertEquals(expected,actual);
    }

}