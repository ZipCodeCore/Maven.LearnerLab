package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();

        zcw.hostLecture(instructors.findById(11L),3);

        Student student1 = new Student;
        Assert.assertEquals(3, student1.getTotalStudyTime());

    }


}


