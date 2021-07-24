package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void TestWhatever(){
        Instructors instance = Instructors.getInstance();

        Integer actual = instance.personList.size();
        Integer expected = 3;
        Assert.assertEquals(expected, actual);
    }
}
