package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static io.zipcoder.interfaces.Educator.TARIQ;

public class TestInstructors {

    @Test
    public void testSingleton(){
        Instructors instructors = Instructors.getInstance();
        String expected = "Tariq";
        String actual = instructors.findById(1000).getName();
        Assert.assertEquals(expected, actual);
    }


}
