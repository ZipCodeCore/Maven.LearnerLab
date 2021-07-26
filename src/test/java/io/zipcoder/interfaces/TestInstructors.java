package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void test(){
        //given
        int expectedValue=3;
        Instructors instance=Instructors.getInstance();
        //when
        int actualValue=instance.personList.size();
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }
}
