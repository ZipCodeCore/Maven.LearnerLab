package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class StudentsTest {

    @Test
    public void getInstance() throws Exception {
        String actual="";

        Students students=Students.getInstance();

        Student [] expected = new Student [34];

        for (int i=0; i<34; i++)
           expected[i]=new Student(i+1);

        //Person<E> [] persons=Students.getInstance().getArray();


        //Assert.assertEquals(Arrays.toString(expected), Arrays.toString(persons));
    }

}