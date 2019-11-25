package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test1(){
        Person actualStudent = null;
        Long [] studentArray = {5L, 6L};
        Students actual = Students.getInstance();

        for (int i = 0; i < studentArray.length; i++) {
            actualStudent = actual.findById(studentArray[i]);
        }

        Assert.assertTrue(actualStudent != null);
    }




}
