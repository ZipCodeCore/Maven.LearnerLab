package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class InstructorsTest {



    @Test
    public void instructorsTest() {
        //Given
        Instructors.getInstance();

        //When
        int expected = 3;
        int actual = Instructors.getInstance().getCount();

        //Then
        Assert.assertEquals(expected, actual);


    }


}


