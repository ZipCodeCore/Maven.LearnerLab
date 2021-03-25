package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class PersonTest {

    @Test
    public void testConstructor()
    {

        //Given
        long expectedId = 5L; // given that you have a long id
        String expectedName = "Adam";

        //When
        Person person = new Person(expectedName, expectedId); //When you create a person using that id
        long actualId = person.getId(); //

        //Then
        //expect is that person will hold a value of 5
        //Assert that our value wil be the expected comparted to the actual
        Assert.assertEquals(expectedId, actualId);



    }

    @Test
    public void testSetName()
    {
        //Given
        //given a name and a person
        String expected = "Bob";
        Person person = new Person(expected,0L);

        //When
        //when we try to get person name
        person.setName(expected);
        String actual = person.getName();

        //Then
        //we expect to see the given name
        Assert.assertEquals(expected, actual);
    }

}
