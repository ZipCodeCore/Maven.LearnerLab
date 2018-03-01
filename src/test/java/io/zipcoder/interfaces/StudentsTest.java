package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstance() {
        //Given
        Students.getInstance();

        //When
        int expected = 4;
        int actual = Students.getInstance().getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }

    }