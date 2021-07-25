package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void TestInstance() {
        //given
        Instructors instance= Instructors.getINSTANCE();
        Integer actual= instance.personList.size();
        Integer expected=3;
        Assert.assertEquals(expected,actual);
    }
}
