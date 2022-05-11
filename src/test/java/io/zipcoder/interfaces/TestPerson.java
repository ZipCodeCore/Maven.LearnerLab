package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
Person person;

@Before
public void setUp(){
    person = new Person(12345678910L);
}
    @Test
    public void testConstructor() {
        Long expected = 12345678910L;
        Long actual = person.getId();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetName(){
        String expected = "Jess";
        person.setName(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
}

