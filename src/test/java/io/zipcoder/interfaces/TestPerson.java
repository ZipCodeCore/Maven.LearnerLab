package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void getIDTest()
    {
        //: Given
        Person person1 = new Person(123);
        long expected = 123;

        //:When
        long actual = person1.getID();

        //:Then

        Assert.assertEquals("Everything equals", expected, actual );

    }


@Test
public void getNameTest(){

    //Given
    Person person2 = new Person(1);
    String expected = "linda";
    person2.setName("linda");

    //When
    String actual = person2.getName();

    //Then
    Assert.assertEquals("same name,", expected, actual);
}





    }

