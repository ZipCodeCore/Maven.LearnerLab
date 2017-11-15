package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors(){
        Instructors instructors = Instructors.getInstance();
        int expected = 4;
        int actual = instructors.personList.size();
        Assert.assertEquals(expected,actual);
    }
}
