package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest() {
        Person person1 = new Person(2);

        long expected = 2;
        long actual = person1.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Person person1 = new Person(45);
        person1.setName("Bob");

        String excpected = "Bob";
        String actual = person1.getName();

        Assert.assertEquals(excpected, actual);
    }

}
