package io.zipcoder.interfaces;

import org.junit.*;

public class TestStudents {

    @Test
    public void test(){

        long[] expected = {786,618,371};
        Students actual = Students.getInstance();

        for(int i = 0; i < expected.length; i++){
            Person actualStudent = actual.findById(expected[i]);
        }

        Assert.assertTrue(actual != null);

    }

}