package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    Person person;

    @Before
    public void setUp() {
        person = new Person("Uncle Bob", 1L);
    }

    @Test
    public void testConstructor(){
       Assert.assertNotNull(person.getId());
    }

    @Test
    public void testConstructorName(){
        Assert.assertEquals("Uncle Bob", person.getName());
    }

    @Test
    public void testSetName(){
        person.setName("Uncle Bill");
        Assert.assertEquals("Uncle Bill", person.getName());
    }

}
