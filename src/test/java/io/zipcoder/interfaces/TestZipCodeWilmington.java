package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();

        zcw.hostLecture(Educator.ZAN,3);

        Assert.assertEquals(3, Educator.ZAN.getTimeWorked(),0);

    }


}


