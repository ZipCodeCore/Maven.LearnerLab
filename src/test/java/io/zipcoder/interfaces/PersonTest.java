package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test //ensures that a Person object's id field is being set upon construction.
    public void testConstructor(){
        //Given
            //that you have a long id
            long expectedId = 5L;
        //When
            //you create a person and get their id
            Person person = new Person(expectedId);
            long actualId = person.getId();
        //Then
            //we expect that the person will now hold a value of 5
            Assert.assertEquals(expectedId,actualId);
    }

    @Test //ensures that a Person object's name variable is being set by invoking the .setName method.
    public void testSetName(){
        //Given
            //a name and a person object
            String expected = "SampleName";
            Person person = new Person(0L);

        //When
            //we try to set the name
            person.setName(expected);
            //we try to get the name
            String actual = person.getName();


        //Then
            //we expect to see the given name
            Assert.assertEquals(expected,actual);

    }

}
