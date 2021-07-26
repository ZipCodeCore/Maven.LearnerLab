package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    Person testPerson = new Person(1);

    @Test
    public void constructorTest(){
        long expected = 1;
        long actual = testPerson.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameTest(){
        testPerson.setName("Kyle");
        String expected = "Kyle";
        String actual = testPerson.getName();
        Assert.assertEquals(expected, actual);
    }
}
