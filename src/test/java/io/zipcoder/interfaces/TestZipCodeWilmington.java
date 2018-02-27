package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture1(){
        ZipCodeWilmington.getInstance().hostLecture(1,20);
        double expected = 5;
        Student student = (Student) Students.getInstance().getArray()[0];
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .005);
    }

    @Test
    public void  testHostLecture2(){

        Instructor instructor = (Instructor) Instructors.getInstance().findById(1);
        ZipCodeWilmington.getInstance().hostLecture(instructor,20);
        double expected = 5;
        Student student = (Student) Students.getInstance().getArray()[0];
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .005);
    }
}
