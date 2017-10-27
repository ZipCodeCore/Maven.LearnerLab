package io.zipcoder.interfaces;

import io.zipcoder.interfaces.classes.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    Person testPerson = new Person(1,"Bob");

    @Test
    public void TestConstructor() {
        //tests if ID ia being set upon creation.

        long expected = 1;
        long actual = testPerson.getId();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testSetName(){
        testPerson.setName("Jim");

        String expected = "Jim";
        String actual = testPerson.getName();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testConstructor(){

        String expected = "Bob";
        String actual = testPerson.getName();

        Assert.assertEquals(expected,actual);
    }
}
