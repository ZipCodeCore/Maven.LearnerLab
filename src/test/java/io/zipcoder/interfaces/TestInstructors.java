package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void getInstructors(){
        //Given
        Instructors instructors = Instructors.getInstance();
        Integer expected = 3;

        //When
        Integer actual = instructors.personList.size();

        //Then
        Assert.assertEquals(expected, actual);

    }
}
