package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    @Before



    @Test
    public void testPersonConstructor(){
    Person person = new Person(5);
    long expected = 5;
    long actual = person.getId();

    Assert.assertEquals(actual,expected);



    }


    @Test
    public void testSetNamePerson() {
        Person person = new Person(5);
        person.setName("Jonathan");
        String expected = "Jonathan";
        String actual = person.getName();

        Assert.assertEquals(actual,expected);

    }

}
