package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

//    @Test
//    public void constructorTest(){
//        //Given
//        Person person = new Person(000045);
//        //When
//        long expected = 000045;
////        long actual =;
////        //Then
////        Assert.assertEquals(person.id = 000045);
//    }

    @Test
    public void setName() {
        //Given
        Person person = new Person(000045);
        person.setName("Bob");
        //When
        String expected = "Bob";
        String actual = person.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }
}