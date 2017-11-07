package io.zipcoder.interfaces;

import io.zipcoder.interfaces.donald.fountain.classroomLab.Person;
import org.junit.*;

public class TestPerson {

    long idExpected = 100000;

    @Test
    public void constructorTest(){
        //: Given
        long expected = idExpected;

        //: When
        Person testPerson = new Person(idExpected);
        long actual = testPerson.getId();

        //: Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setNameTest(){
        //: Given
        String expected = "Donald";

        //: When
        Person testPerson = new Person(idExpected);
        testPerson.setName(expected);
        String actual = testPerson.getName();

        //: Then
        Assert.assertEquals(expected, actual);
    }

}
