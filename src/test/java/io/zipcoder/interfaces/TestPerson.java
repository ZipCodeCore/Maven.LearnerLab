package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    Person personTest;
    @Before
    public void setUp() {
      personTest = new Person(1);
    }

    @Test
    public void testConstructorId() {
        //Given
        long expected = 1;

        //When
        long actual = personTest.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorName() {
        //Given
        String expected = "Gabi";

        //When
        String actual = personTest.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        //Given
        long expected = 1;

        //When
        long actual = personTest.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        //Given
        String expected = "Gabi";

        //When
        String actual = personTest.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //Given
        String expected = "Laila";

        //When
        personTest.setName("Laila");
        String actual = personTest.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

}
