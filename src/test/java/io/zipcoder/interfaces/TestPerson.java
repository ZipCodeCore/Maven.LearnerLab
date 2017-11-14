package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test

    public void ConstructorPersonTest(){

        Person person = new Person(2);
    }

    @Test

    public void ConstructorPersonTest2(){

        Person person = new Person("raul");
    }

    @Test

    public void setNameTest(){

        Person person = new Person(2);
        String myName = "raul";
        person.setName(myName);
        String expected = "raul";
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }




}
