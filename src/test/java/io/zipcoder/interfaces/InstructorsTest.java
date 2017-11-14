package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InstructorsTest {
    @Test
    public void getInstance() throws Exception {

        String actual="";

        Instructor [] expected = new Instructor[2];

        for (int i=0; i<2; i++)
            expected[i]=new Instructor(i,Educator.values()[i]);

        Instructor[] persons=Instructors.getInstance().getArray();


        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(persons));
    }

}