package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLectureOne(){
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Student student1 = (Student) students.findById(102);
        student1.setTotalStudyTime(50);
        Instructor dirOfEd = (Instructor) Instructors.getInstance().findById(1000);
        zipCodeWilmington.hostLecture(dirOfEd, 24);
        double expected = 53;
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.0);
    }

}
