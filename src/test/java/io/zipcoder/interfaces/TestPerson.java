package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person person = new Person(5L);
        long expected = 5L;
        long actual = person.getId();
        Assert.assertEquals(expected, actual);
    }

   @Test
    public void testSetName(){
        Person person = new Person(5L);
        String expected = "Ryan";
        person.setName("Ryan");
        String actual = person.getName();
        Assert.assertEquals("Ryan", expected, actual);
    }

    @Test
    public void testConstructorPerson(){
        Person person = new Person(5);


    }

}
