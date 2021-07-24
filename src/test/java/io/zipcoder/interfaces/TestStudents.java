package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void TestWhatever(){
        Students instance = Students.getInstance();

        Integer actual = instance.personList.size();
        Integer expected = 5;
        Assert.assertEquals(expected, actual);
    }

}
