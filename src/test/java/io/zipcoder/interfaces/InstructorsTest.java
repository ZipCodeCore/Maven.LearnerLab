package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InstructorsTest {
    @Test
    public void getInstance() throws Exception {

        String actual="";

        Instructor [] expected = new Instructor[4];

        for (int i=0; i<4; i++)
            expected[i]=new Instructor(i+21);

        Person [] persons=Instructors.getInstance().getArray();


        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(persons));
    }

}