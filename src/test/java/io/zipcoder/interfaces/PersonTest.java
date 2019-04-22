package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    Person person;

    @Before
    public void setUp() {
        person = new Person();
    }
    @Test
    public void constructorTest1(){
        //Given
        long expectedId = -1;
        //When
        Person person = new Person(expectedId);
        long actualId = person.getId();
        Assert.assertEquals(expectedId, actualId);
    }
    @Test
    public void constructorTest2(){
        //Given
        String expectedName = "James";
        //When
        Person person = new Person(expectedName);
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void constructorTest3() {
        //Given
        String expectedName = "PersonName";
        long expectedId = -1;

        // When
        Person person = new Person(expectedId, expectedName);
        String actualName = person.getName();
        long actualId = person.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void setNameTest() {
        String expectedName = "James";
        person.setName(expectedName);

        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }
}
