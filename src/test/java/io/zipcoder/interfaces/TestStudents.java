package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void StudentSingletonTest(){
        //Given
        Students.getInstance();

        //When
        int expected = 6;
        int actual = Students.getInstance().getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
