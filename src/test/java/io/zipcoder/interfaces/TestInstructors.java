package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstance() {
        //given
        int expected = 4;
        Instructors instance = Instructors.getInstance();
        //when
        int actual = instance.personList.size();
        //then
        Assert.assertEquals(expected, actual);
    }
}
