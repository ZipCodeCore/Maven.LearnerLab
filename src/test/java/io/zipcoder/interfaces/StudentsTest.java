package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;



public class StudentsTest {


    @Test
    public void studentsTest(){
        //Given
        Students.getInstance();

        //When
        int expected = 5;
        int actual = Students.getInstance().getCount();

        //Then
        Assert.assertEquals(expected,actual);
    }



}
