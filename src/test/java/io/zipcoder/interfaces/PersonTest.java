package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person person;

    @Test
    public void testConstructor(){
        person = new Person(2147483649L);

        long expected = 2147483649L;
        long actual = person.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName() {
        person = new Person(5147483649L);
        String name = "Katrice";
        String expected = "Katrice";


        person.setName("Katrice");

        String actual = person.getName();

        Assert.assertEquals(expected,actual);
    }
}