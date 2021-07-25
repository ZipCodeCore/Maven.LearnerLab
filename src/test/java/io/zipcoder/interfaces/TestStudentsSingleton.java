package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudentsSingleton {

    @Test
    public void getStudentsTest(){
        //given
        People people = Students.getInstance();
        int expected = 17;

        //when
        int actual = people.count();

        //then
        Assert.assertEquals(expected, actual);

    }
}
