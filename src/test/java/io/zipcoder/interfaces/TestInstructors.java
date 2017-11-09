package io.zipcoder.interfaces;

import org.junit.*;


public class TestInstructors {
    @Test
    public void test() {

        long[] expected = {123,456,789};
        Instructors actual = Instructors.getInstance();

        for(int i = 0; i < expected.length; i++){
            Person actualInstructor = actual.findById(expected[i]);
        }

        Assert.assertTrue(actual != null);


    }

}