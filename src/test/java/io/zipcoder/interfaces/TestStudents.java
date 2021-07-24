package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testInstance() {
        //given
        int expected = 4;
        Students instance = Students.getInstance();
        //when
        int actual = instance.personList.size();
        //then
        Assert.assertEquals(expected, actual);
    }
}
