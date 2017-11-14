package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InstructorsTest {
    @Test
    public void getInstance() throws Exception {

        String actual="";

        Instructor [] expected = new Instructor[3];

        for (int i=0; i<3; i++)
            expected[i]=new Instructor(i+1,Educator.values()[i].getName());

        Instructor[] persons=Instructors.getInstance().getArray();


        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(persons));
    }

}