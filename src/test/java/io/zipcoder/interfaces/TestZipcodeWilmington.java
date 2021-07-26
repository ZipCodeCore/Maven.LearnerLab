package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipcodeWilmington {
   @Test
    public void testHostLecture(){
       ZipcodeWilmington zip = new ZipcodeWilmington();
       Students student1 = Students.getInstance();

       zip.hostLecture(12, 12.0);
       Double expected = 12.0 / 3;
       Double actual = student1.findById(8383).getTotalStudyTime();

       Assert.assertEquals(expected,actual);
   }

}
