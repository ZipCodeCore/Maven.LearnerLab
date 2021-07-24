package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void constructorTest() {
        //given
        String name = "Louie";
        Long id = 34567L;

        //when
        Person person = new Person(id, name);
        String actual = person.getName();
        Long actualId = person.getId();

        //then
        Assert.assertEquals(name, actual);
        Assert.assertEquals(id, actualId);

    }

    @Test
    public void setNameTest(){
        //given
        String name = "Louie";
        Long id = 23456L;
        String expected = "Tom";

        //when
        Person person = new Person(id, name);
        person.setName(expected);

        //then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);

    }

}
