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

        test.hostLecture(instructors.findById(0), 100);
        Student teststudent = students.findById(1);
        double actual = Math.floor(teststudent.getTotalStudyTime());

        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testHostLecture2(){
        ZipCodeWilmington test = new ZipCodeWilmington();
        double expected = 44;
        Student teststudent = students.findById(0);
        test.hostLecture(0,1200);
        double actual = Math.floor(teststudent.getTotalStudyTime());

        Assert.assertEquals(expected,actual,0);

    }
}