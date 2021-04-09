package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void personConstructorWithIdTest(){
        //Given
        long expected = 85849;
        //When
        Person newPerson = new Person("Bob", expected);
        long actual = newPerson.getId();
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setNameTest(){
        //Given
        long id = 85849;
        String expected = "Elvira";
        //When
        Person newPerson = new Person(expected, id);
        newPerson.setName(expected);
        String actual = newPerson.getName();
        //Then
        Assert.assertEquals(expected,actual);
    }

}
