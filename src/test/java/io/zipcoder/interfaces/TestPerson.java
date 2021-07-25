package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void constructorTest(){
        //given
        String name = "John";
        long id = 12;
        //when
        Person person = new Person(id,name);
        //then
        Assert.assertEquals(id,person.getId());
        Assert.assertEquals(name,person.getName());
    }

    @Test
    public void setNameTest(){
        //given
        String name = "John";
        long id = 12;
        Person person = new Person(id,name);
        //when
        person.setName("Jason");
        //then
        Assert.assertEquals("Jason", person.getName());
    }
}
