package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void getInstanceTest(){
        //Given

        //When
        Instructors ione = Instructors.getInstance();
        Instructors itwo = Instructors.getInstance();
        //Then
        Assert.assertEquals(true, ione == itwo);

    }
}
