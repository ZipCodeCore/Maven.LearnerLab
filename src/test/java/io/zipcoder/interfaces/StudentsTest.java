package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void getInstanceTest(){
        //Given
        //When
        Students sone = Students.getINSTANCE();
        Students stwo = Students.getINSTANCE();
        //Then
        Assert.assertEquals(true, sone == stwo);
    }
}
