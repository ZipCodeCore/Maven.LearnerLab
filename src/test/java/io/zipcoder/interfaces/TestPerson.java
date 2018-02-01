package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class TestPerson {

    @Test
    public void testConstructor(){
        long expected=1000203;
        Person newPerson = new Person(expected, "");

        long actual = newPerson.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor_Name(){
        String expected = "Timothy";
        Person person = new Person(0l, expected);

        Assert.assertEquals(expected, person.getName());
    }

    @Test
    public void testSetName(){
        String expected="Timothy";
        Person newPerson = new Person(10298938, expected);
        newPerson.setName(expected);

        String actual = newPerson.getName();

        Assert.assertEquals(expected, actual);
    }


}
