package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {


    @Test
    public void personConstructorTest() {
        Person person = new Person(9, "Bob");
        long actual = person.getId();
        String actual1 = person.getName();
        long expected = 9;
        String expected1 = "Bob";

        Assert.assertEquals(actual,expected);
        Assert.assertEquals(actual1,expected1);
    }
    @Test
    public void setNameTest() {
        Person person = new Person(9, "Bob");
        person.setName("Jim");
        String actual = person.getName();
        String expected = "Jim";

        Assert.assertEquals(actual, expected);
    }


}
