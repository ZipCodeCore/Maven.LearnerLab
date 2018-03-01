package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstance() {
        //Given
        Instructors.getInstance();

        //When
        int expected = 4;
        int actual = Instructors.getInstance().getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }
}