package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void setConstructor (){
        //Given
        long expectedId = 123;
        String expectedname = "Mickey";
        Person person = new Person(expectedId, expectedname);

        //WHEN
        long actual = person.getId();
        String actual1 = person.getName();

        //WHEN
        Assert.assertEquals(expectedId, actual);
        Assert.assertEquals(expectedname, actual1);
    }

    @Test
    public void setNameTest(){
        //GIVEN
        Person person = new Person(123, "Mickey");


         //WHEN
        String expected = "laura";
        person.setName(expected);
        String actual = person.getName();

        //WHEN
        Assert.assertEquals(expected,actual);
    }



}
