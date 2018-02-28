package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void InstructorsSingletonTest(){
        //Given
        Instructors.getInstance();

        //When
        int expected = 6;
        int actual = Instructors.getInstance().getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
