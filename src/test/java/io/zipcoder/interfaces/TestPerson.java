package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    Person<Person> person=new Person<Person>(123);
    @Test
    public void getId() throws Exception {
        long expected=123;

        long actual=person.getId();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void SetAndgetName() throws Exception {


        String expected="Elliott";

        person.setName("Elliott");

        String actual =person.getName();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setName() throws Exception {

        person.setName("Elliott");
        String expected="Elliott";

        String actual =person.getName();

        Assert.assertEquals(expected, actual);
    }


}
