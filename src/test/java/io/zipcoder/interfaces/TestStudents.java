package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudents(){

        Students numberOfStudents = Students.getInstance();
        int expected = 26;
        int actual = numberOfStudents.studentList.size();
        Assert.assertEquals (expected, actual);


    }

}