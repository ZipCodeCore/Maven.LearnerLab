package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

@Test
    public void testGetInstance() {
    //Given
    Students.getInstance();


    //When
    double expected = 5;
    double actual = Students.getInstance().getCount();


    //Then
    Assert.assertEquals(expected,actual,.05);

}

}