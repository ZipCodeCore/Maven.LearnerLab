package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
 @Test
    public void testConstructor(){
     //given
     Long expectedId = 5L;//given that you have a long id

     //when
     Person person = new Person(expectedId); //you create a person using id
     Long actualId = person.getId();
     //then
     //expected is that person will hold a value of 5
     //assert that our value will be the expected to actual

    Assert.assertEquals(expectedId, actualId);
 }
 @Test
    public void testSetName(){
     //Given
     //given a name and a person
     String expected = "SampleName";
     Person person = new Person(0L);

     //When
     //When we try to set the name
     person.setName(expected);
     String actual = person.getName();

     //then
     Assert.assertEquals(expected, actual);

 }
}
