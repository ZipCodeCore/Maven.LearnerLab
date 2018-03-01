package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test

    public void SingletonStudentTest(){
        Students.getINSTANCE();

        int expected = 4;
        int actual = Students.getINSTANCE().getCount();

        Assert.assertEquals(expected, actual);
    }
}