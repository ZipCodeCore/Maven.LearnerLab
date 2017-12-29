package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructors(){

                Instructors instructors = Instructors.getInstance();
                int expected = 5;
                int actual = instructors.instructorList.size();
                Assert.assertEquals(expected,actual);
            }
}





