package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class testZipCodeWilmington {

    ZipCodeWilmington zipCode = ZipCodeWilmington.getInstance();

    @Test
    public void testHostLecture() {
        Students testStudents = Students.getInstance();
       // Instructors testInstructors = Instructors.getInstance();

        Student[] list = testStudents.getStudentsArray();
        Instructor Tariq = new Instructor(1);

        zipCode.hostLecture(Tariq, 10);

        double expected = 3;
        double actual = list[0].getTotalStudyTime();

        Assert.assertEquals(expected, actual,.5);

    }


}