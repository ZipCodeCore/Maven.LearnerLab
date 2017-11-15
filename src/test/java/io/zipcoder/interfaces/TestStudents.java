package io.zipcoder.interfaces;

import org.junit.*;

public class TestStudents {

    @Test
    public void test(){

        long[] expected = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
        Students actual = Students.getInstance();

        for(int i = 0; i < expected.length; i++){
            Person actualStudent = actual.findById(expected[i]);
        }

        Assert.assertTrue(actual != null);

    }

}