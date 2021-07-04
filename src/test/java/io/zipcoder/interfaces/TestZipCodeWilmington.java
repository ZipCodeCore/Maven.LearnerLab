package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
    Students students = Students.getInstance();
    @Test
    public void testHostLectureOne(){

        Student student1 = students.findById(102);
        student1.setTotalStudyTime(50);
        Instructor dirOfEd = Instructors.getInstance().findById(1000);
        zipCodeWilmington.hostLecture(dirOfEd, 24);
        double expected = 53;
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testHostLectureTwo(){
        Student student1 = students.findById(102);
        student1.setTotalStudyTime(50);
        zipCodeWilmington.hostLecture(1000, 24);
        double expected = 53;
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.0);
    }
}
