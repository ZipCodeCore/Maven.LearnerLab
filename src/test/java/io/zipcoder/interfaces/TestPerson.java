package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest(){
        //Given
        Person stinkyPete = new Person(69);

        //When
        long expected = 69;
        long actual = stinkyPete.getID();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest(){
        //Given
        Person stinkyPete = new Person(69);
        stinkyPete.setName("Stinky Pete");

        //When
        String expected = "Stinky Pete";
        String actual = stinkyPete.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

}
