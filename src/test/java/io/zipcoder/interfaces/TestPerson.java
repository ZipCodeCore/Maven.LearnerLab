package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        //given
        Long expectedId=21l;
        String expectedName="amilia";
        //when
        Person amilia=new Person(expectedId,expectedName);
        Long actualId=amilia.getId();
        String actuaName=amilia.getName();
        //then
        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actuaName);
    }

    @Test
    public void testSetName(){
        //given
        Person person=new Person(23l,"georgia");
        String expectedName="fabiana";
        //when
        person.setName(expectedName);
        String actualName=person.getName();
        //then
        Assert.assertEquals(expectedName,actualName);
    }

}
