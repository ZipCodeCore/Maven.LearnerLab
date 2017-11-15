package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InstructorsTest {
    @Test
    public void getInstance() throws Exception {

        String actual="";
        String expectedString="";

        Instructor [] expected = new Instructor[3];

        for (int i=0; i<3; i++)
            expected[i]=new Instructor(i+1,Educator.values()[i].getName());

        Instructor[] persons=Instructors.getInstance().getArray();

        for (Instructor i:persons)
            actual+=i.educator+"\n";
        for (Instructor i:expected)
            expectedString+=i.educator+"\n";

        Assert.assertEquals(expectedString, actual);
    }

}