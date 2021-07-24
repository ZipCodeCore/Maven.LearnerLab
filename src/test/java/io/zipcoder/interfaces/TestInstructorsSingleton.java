package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructorsSingleton {

    @Test
    public void getInstructorsTest(){
        //given
        People people = Instructors.getInstance();
        int expected = 3;

        //when
        int actual = people.count();

        //then
        Assert.assertEquals(expected, actual);

    }
}
