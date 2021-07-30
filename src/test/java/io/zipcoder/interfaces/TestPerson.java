package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {



    @Test
    public void constructorTest() {
        Person testPerson = new Person(5);
        long expected = 5;
        long actual = testPerson.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Person testPerson = new Person(7);
        testPerson.setName("Bones");
        String expected = "Bones";
        String actual = testPerson.getName();
        Assert.assertEquals(expected, actual);
    }

}
