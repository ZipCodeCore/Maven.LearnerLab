package io.zipcoder.interfaces.classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    private Students students = Students.getINSTANCE();
    private Instructors instructors = Instructors.getInstance();

    @Test
    public void testHostLecture() {
        ZipCodeWilmington test = new ZipCodeWilmington();
        double expected = 3;

        test.hostLecture((Instructor) instructors.findById(0), 100);
        Student teststudent = (Student)students.findById(1);
        double actual = Math.floor(teststudent.getTotalStudyTime());

        Assert.assertEquals(expected, actual,0);

    }

}